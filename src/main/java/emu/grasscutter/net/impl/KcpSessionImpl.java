package emu.grasscutter.net.impl;

import emu.grasscutter.net.IKcpSession;
import emu.grasscutter.net.INetworkTransport;
import io.netty.buffer.Unpooled;
import kcp.highway.Ukcp;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

/**
 * This is the default implementation of a KCP session.
 * It uses {@link Ukcp} as the underlying wrapper.
 */
@Getter
public class KcpSessionImpl implements IKcpSession {
    private final Ukcp handle;
    private final Logger logger;

    public KcpSessionImpl(Ukcp handle) {
        this.handle = handle;
        this.logger = LoggerFactory.getLogger("KcpSession " + handle.getConv());
    }

    @Override
    public InetSocketAddress getAddress() {
        return this.getHandle().user().getRemoteAddress();
    }

    @Override
    public void close() {
        this.getHandle().close(true);
    }

    @Override
    public void send(byte[] data) {
        var buffer = Unpooled.wrappedBuffer(data);
        try {
            this.getHandle().write(buffer);
        } catch (Exception ex) {
            this.getLogger().warn("Unable to send packet.", ex);
        } finally {
            buffer.release();
        }
    }
}
