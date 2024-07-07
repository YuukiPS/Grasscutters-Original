package emu.grasscutter.server.game;

public interface IGameSession {
    /**
     * Invoked when the server establishes a connection to the client.
     * <p>
     * This is invoked after the KCP handshake is completed.
     */
    void onConnected();

    /**
     * Invoked when the server loses connection to the client.
     */
    void onDisconnected();

    /**
     * Invoked when the server receives data from the client.
     *
     * @param data The raw data (not KCP-encoded) received from the client.
     */
    void onReceived(byte[] data);
}
