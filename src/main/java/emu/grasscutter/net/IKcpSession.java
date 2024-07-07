package emu.grasscutter.net;

import org.slf4j.Logger;

import java.net.InetSocketAddress;

/**
 * This is most closely related to the previous `KcpTunnel` interface.
 */
public interface IKcpSession {
    /**
     * @return The session's unique logger.
     */
    Logger getLogger();

    /**
     * @return The connecting client's address.
     */
    InetSocketAddress getAddress();

    /**
     * Closes the server's connection to the client.
     */
    void close();

    /**
     * Sends raw data to the client.
     *
     * @param data The data to send. This should not be KCP-encoded.
     */
    void send(byte[] data);
}
