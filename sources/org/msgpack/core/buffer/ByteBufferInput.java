package org.msgpack.core.buffer;

import java.nio.ByteBuffer;

public class ByteBufferInput implements MessageBufferInput {
    private ByteBuffer input;
    private boolean isRead = false;

    public ByteBufferInput(ByteBuffer byteBuffer) {
        this.input = (ByteBuffer) xdu.a(byteBuffer, (Object) "input ByteBuffer is null");
    }

    public void close() {
    }

    public MessageBuffer next() {
        if (this.isRead) {
            return null;
        }
        this.isRead = true;
        return MessageBuffer.wrap(this.input);
    }

    public ByteBuffer reset(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.input;
        this.input = byteBuffer;
        this.isRead = false;
        return byteBuffer2;
    }
}
