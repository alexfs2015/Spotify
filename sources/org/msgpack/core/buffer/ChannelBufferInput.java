package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public class ChannelBufferInput implements MessageBufferInput {
    private final int bufferSize;
    private ReadableByteChannel channel;
    private boolean reachedEOF;

    public ChannelBufferInput(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, 8192);
    }

    public ChannelBufferInput(ReadableByteChannel readableByteChannel, int i) {
        boolean z = false;
        this.reachedEOF = false;
        this.channel = (ReadableByteChannel) wpp.a(readableByteChannel, (Object) "input channel is null");
        if (i > 0) {
            z = true;
        }
        StringBuilder sb = new StringBuilder("buffer size must be > 0: ");
        sb.append(i);
        wpp.a(z, (Object) sb.toString());
        this.bufferSize = i;
    }

    public ReadableByteChannel reset(ReadableByteChannel readableByteChannel) {
        ReadableByteChannel readableByteChannel2 = this.channel;
        this.channel = readableByteChannel;
        this.reachedEOF = false;
        return readableByteChannel2;
    }

    public MessageBuffer next() {
        if (this.reachedEOF) {
            return null;
        }
        MessageBuffer newBuffer = MessageBuffer.newBuffer(this.bufferSize);
        ByteBuffer byteBuffer = newBuffer.toByteBuffer();
        while (!this.reachedEOF && byteBuffer.remaining() > 0) {
            if (this.channel.read(byteBuffer) == -1) {
                this.reachedEOF = true;
            }
        }
        byteBuffer.flip();
        if (byteBuffer.remaining() == 0) {
            return null;
        }
        return newBuffer.slice(0, byteBuffer.limit());
    }

    public void close() {
        this.channel.close();
    }
}
