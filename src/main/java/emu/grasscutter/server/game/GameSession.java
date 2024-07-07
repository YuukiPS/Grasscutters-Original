package emu.grasscutter.server.game;

import static emu.grasscutter.config.Configuration.*;
import static emu.grasscutter.utils.lang.Language.translate;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.Grasscutter.ServerDebugMode;
import emu.grasscutter.game.Account;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.IKcpSession;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.server.event.game.SendPacketEvent;
import emu.grasscutter.utils.*;
import io.netty.buffer.*;
import java.net.InetSocketAddress;
import lombok.*;
import org.slf4j.Logger;

public class GameSession implements IGameSession {
    @Getter private final GameServer server;
    private IKcpSession session;

    @Getter @Setter private Account account;
    @Getter private Player player;

    @Getter private long encryptSeed = Crypto.ENCRYPT_SEED;
    private byte[] encryptKey = Crypto.ENCRYPT_KEY;

    @Setter private boolean useSecretKey;
    @Getter @Setter private SessionState state;

    @Getter private int clientTime;
    @Getter private long lastPingTime;
    private int lastClientSeq = 10;

    public GameSession(GameServer server, IKcpSession session) {
        this.server = server;
        this.session = session;

        this.state = SessionState.WAITING_FOR_TOKEN;
        this.lastPingTime = System.currentTimeMillis();

        if (GAME_INFO.useUniquePacketKey) {
            this.encryptKey = new byte[4096];
            this.encryptSeed = Crypto.generateEncryptKeyAndSeed(this.encryptKey);
        }
    }

    public InetSocketAddress getAddress() {
        return this.session.getAddress();
    }

    public Logger getLogger() {
        return this.session.getLogger();
    }

    public synchronized void setPlayer(Player player) {
        this.player = player;
        this.player.setSession(this);
        this.player.setAccount(this.getAccount());
    }

    public boolean isLoggedIn() {
        return this.getPlayer() != null;
    }

    public void updateLastPingTime(int clientTime) {
        this.clientTime = clientTime;
        this.lastPingTime = System.currentTimeMillis();
    }

    public int getNextClientSequence() {
        return ++lastClientSeq;
    }

    public void logPacket(String sendOrRecv, int opcode, byte[] payload) {
        this.session.getLogger().info("{}: {} ({})",
            sendOrRecv, PacketOpcodesUtils.getOpcodeName(opcode), opcode);
        if (GAME_INFO.isShowPacketPayload) System.out.println(Utils.bytesToHex(payload));
    }

    public void send(BasePacket packet) {
        // Test
        if (packet.getOpcode() <= 0) {
            this.session.getLogger().warn("Attempted to send packet with unknown ID!");
            return;
        }

        // Header
        if (packet.shouldBuildHeader()) {
            packet.buildHeader(this.getNextClientSequence());
        }

        // Log
        switch (GAME_INFO.logPackets) {
            case ALL -> {
                if (!PacketOpcodesUtils.LOOP_PACKETS.contains(packet.getOpcode())
                        || GAME_INFO.isShowLoopPackets) {
                    logPacket("SEND", packet.getOpcode(), packet.getData());
                }
            }
            case WHITELIST -> {
                if (SERVER.debugWhitelist.contains(packet.getOpcode())) {
                    logPacket("SEND", packet.getOpcode(), packet.getData());
                }
            }
            case BLACKLIST -> {
                if (!SERVER.debugBlacklist.contains(packet.getOpcode())) {
                    logPacket("SEND", packet.getOpcode(), packet.getData());
                }
            }
            default -> {}
        }

        // Invoke event.
        SendPacketEvent event = new SendPacketEvent(this, packet);
        event.call();
        if (!event.isCanceled()) { // If event is not cancelled, continue.
            try {
                packet = event.getPacket();
                var bytes = packet.build();
                if (packet.shouldEncrypt) {
                    Crypto.xor(bytes, packet.useDispatchKey() ? Crypto.DISPATCH_KEY : this.encryptKey);
                }
                this.session.send(bytes);
            } catch (Exception ex) {
                this.session.getLogger().debug("Unable to send packet to client.", ex);
            }
        }
    }

    @Override
    public void onConnected() {
        Grasscutter.getLogger().info(translate("messages.game.connect", this.getAddress().toString()));
    }

    @Override
    public void onReceived(byte[] bytes) {
        // Decrypt and turn back into a packet
        Crypto.xor(bytes, this.useSecretKey ? this.encryptKey : Crypto.DISPATCH_KEY);
        ByteBuf packet = Unpooled.wrappedBuffer(bytes);

        try {
            boolean allDebug = GAME_INFO.logPackets == ServerDebugMode.ALL;
            while (packet.readableBytes() > 0) {
                // Length
                if (packet.readableBytes() < 12) {
                    return;
                }
                // Packet sanity check
                int const1 = packet.readShort();
                if (const1 != 17767) {
                    if (allDebug) {
                        this.session.getLogger().error("Invalid packet header received: got {}, expected 17767", const1);
                    }
                    return; // Bad packet
                }

                // Data
                int opcode = packet.readShort();
                int headerLength = packet.readShort();
                int payloadLength = packet.readInt();
                byte[] header = new byte[headerLength];
                byte[] payload = new byte[payloadLength];

                packet.readBytes(header);
                packet.readBytes(payload);
                // Sanity check #2
                int const2 = packet.readShort();
                if (const2 != -30293) {
                    if (allDebug) {
                        this.session.getLogger().error("Invalid packet footer received: got {}, expected -30293", const2);
                    }
                    return; // Bad packet
                }

                // Log packet
                switch (GAME_INFO.logPackets) {
                    case ALL -> {
                        if (!PacketOpcodesUtils.LOOP_PACKETS.contains(opcode) || GAME_INFO.isShowLoopPackets) {
                            logPacket("RECV", opcode, payload);
                        }
                    }
                    case WHITELIST -> {
                        if (SERVER.debugWhitelist.contains(opcode)) {
                            logPacket("RECV", opcode, payload);
                        }
                    }
                    case BLACKLIST -> {
                        if (!(SERVER.debugBlacklist.contains(opcode))) {
                            logPacket("RECV", opcode, payload);
                        }
                    }
                    default -> {}
                }

                // Handle
                getServer().getPacketHandler().handle(this, opcode, header, payload);
            }
        } catch (Exception ex) {
            this.session.getLogger().warn("Unable to process packet.", ex);
        } finally {
            packet.release();
        }
    }

    @Override
    public void onDisconnected() {
        setState(SessionState.INACTIVE);
        // send disconnection pack in case of reconnection
        Grasscutter.getLogger()
                .info(translate("messages.game.disconnect", this.getAddress().toString()));
        // Save after disconnecting
        if (this.isLoggedIn()) {
            Player player = getPlayer();
            // Call logout event.
            player.onLogout();
        }
        try {
            this.send(new BasePacket(PacketOpcodes.ServerDisconnectClientNotify));
        } catch (Throwable ex) {
            this.session.getLogger().warn("Failed to disconnect client.", ex);
        }

        this.session = null;
    }

    public void close() {
        this.session.close();
    }

    public boolean isActive() {
        return this.getState() == SessionState.ACTIVE;
    }

    public enum SessionState {
        INACTIVE,
        WAITING_FOR_TOKEN,
        WAITING_FOR_LOGIN,
        PICKING_CHARACTER,
        ACTIVE,
        ACCOUNT_BANNED
    }
}
