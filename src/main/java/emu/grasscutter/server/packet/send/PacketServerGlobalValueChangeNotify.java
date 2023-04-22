package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.entity.GameEntity;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.ServerGlobalValueChangeNotifyOuterClass.ServerGlobalValueChangeNotify;
import emu.grasscutter.utils.Utils;

public final class PacketServerGlobalValueChangeNotify extends BasePacket {
    public PacketServerGlobalValueChangeNotify(GameEntity entity, String abilityHash, int value) {
        super(PacketOpcodes.ServerGlobalValueChangeNotify);

        this.setData(
                ServerGlobalValueChangeNotify.newBuilder()
                        .setEntityId(entity.getId())
                        .setValue(value)
                        .setKeyHash(Utils.abilityHash(abilityHash)));
    }
}
