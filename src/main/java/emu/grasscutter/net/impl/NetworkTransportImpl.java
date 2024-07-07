package emu.grasscutter.net.impl;

import emu.grasscutter.net.INetworkTransport;
import emu.grasscutter.server.game.GameSession;
import io.netty.buffer.ByteBuf;
import io.netty.channel.DefaultEventLoop;
import io.netty.channel.EventLoop;
import kcp.highway.ChannelConfig;
import kcp.highway.KcpListener;
import kcp.highway.KcpServer;
import kcp.highway.Ukcp;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import static emu.grasscutter.config.Configuration.GAME_INFO;

/**
 * The default implementation of a {@link INetworkTransport}.
 * Uses {@link KcpServer} as the underlying transport.
 */
@Slf4j
public class NetworkTransportImpl extends KcpServer implements INetworkTransport {
    private final EventLoop networkLoop = new DefaultEventLoop();
    private final ConcurrentHashMap<Ukcp, GameSession> sessions = new ConcurrentHashMap<>();

    @Override
    public void start(InetSocketAddress listening) {
        var settings = new ChannelConfig();
        settings.setTimeoutMillis(GAME_INFO.timeout * 1000);
        settings.nodelay(true, GAME_INFO.kcpInterval, 2, true);
        settings.setMtu(1400);
        settings.setSndwnd(256);
        settings.setRcvwnd(256);
        settings.setUseConvChannel(true);
        settings.setAckNoDelay(false);

        this.init(new Listener(), settings, listening);
    }

    @Override
    public void shutdown() {
        this.stop();

        try {
            this.networkLoop.shutdownGracefully();
            if (!this.networkLoop.awaitTermination(5, TimeUnit.SECONDS)) {
                log.warn("Network loop did not terminate in time.");
            }
        } catch (Exception ex) {
            log.warn("Failed to shutdown network loop.", ex);
        }
    }

    class Listener implements KcpListener {
        @Override
        public void onConnected(Ukcp ukcp) {
            var transport = NetworkTransportImpl.this;

            try {
                var server = transport.waitForServer();
                var session = new KcpSessionImpl(ukcp);
                var gameSession = new GameSession(server, session);

                transport.sessions.put(ukcp, gameSession);
                gameSession.onConnected();
            } catch (InterruptedException | IllegalStateException ex) {
                NetworkTransportImpl.log.warn("Unable to establish connection.", ex);
                ukcp.close();
            }
        }

        @Override
        public void handleReceive(ByteBuf byteBuf, Ukcp ukcp) {
            var transport = NetworkTransportImpl.this;

            try {
                var session = transport.sessions.get(ukcp);
                if (session == null) {
                    NetworkTransportImpl.log.debug("Received data from unknown session.");
                    return;
                }

                transport.networkLoop.submit(() -> session.onReceived(byteBuf.array()));
            } catch (Exception ex) {
                NetworkTransportImpl.log.warn("Unable to handle received data.", ex);
            } finally {
                byteBuf.release();
            }
        }

        @Override
        public void handleException(Throwable throwable, Ukcp ukcp) {
            NetworkTransportImpl.log.debug("Exception occurred in session.", throwable);
        }

        @Override
        public void handleClose(Ukcp ukcp) {
            var sessions = NetworkTransportImpl.this.sessions;
            var session = sessions.get(ukcp);
            if (session == null) {
                NetworkTransportImpl.log.debug("Received close from unknown session.");
                return;
            }

            session.onDisconnected();
            sessions.remove(ukcp);
        }
    }
}
