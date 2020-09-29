package org.msgpack.core.buffer;

import java.nio.channels.WritableByteChannel;

public class ChannelBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private WritableByteChannel channel;

    public ChannelBufferOutput(WritableByteChannel writableByteChannel) {
        this.channel = (WritableByteChannel) wpp.a(writableByteChannel, (Object) "output channel is null");
    }

    public WritableByteChannel reset(WritableByteChannel writableByteChannel) {
        WritableByteChannel writableByteChannel2 = this.channel;
        this.channel = writableByteChannel;
        return writableByteChannel2;
    }

    public MessageBuffer next(int i) {
        MessageBuffer messageBuffer = this.buffer;
        if (messageBuffer == null || messageBuffer.size() != i) {
            this.buffer = MessageBuffer.newBuffer(i);
        }
        return this.buffer;
    }

    public void flush(MessageBuffer messageBuffer) {
        this.channel.write(messageBuffer.toByteBuffer());
    }

    public void close() {
        this.channel.close();
    }
}
