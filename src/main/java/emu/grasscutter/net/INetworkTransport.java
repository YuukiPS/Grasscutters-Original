package emu.grasscutter.net;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.server.game.GameServer;

import java.net.InetSocketAddress;

public interface INetworkTransport {
    /**
     * Waits for the server to be active.
     * This should be used to ensure that the server is ready to accept connections.
     */
    default GameServer waitForServer() throws InterruptedException {
        int depth = 0;

        GameServer server;
        while ((server = Grasscutter.getGameServer()) == null) {
            Thread.sleep(1000);
            if (depth++ > 5) {
                throw new IllegalStateException("Game server is not available!");
            }
        }

        return server;
    }

    /**
     * This is invoked when the transport should start listening for incoming connections.
     *
     * @param listening The address/port to listen on.
     */
    void start(InetSocketAddress listening);

    /**
     * This is invoked when the transport should stop listening for incoming connections.
     * This should also close all active connections.
     */
    void shutdown();
}
