package org.msgpack.core.buffer;

public class ArrayBufferInput implements MessageBufferInput {
    private MessageBuffer buffer;
    private boolean isRead;

    public ArrayBufferInput(MessageBuffer messageBuffer) {
        this.isRead = false;
        this.buffer = (MessageBuffer) wpp.a(messageBuffer, (Object) "input buffer is null");
    }

    public ArrayBufferInput(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ArrayBufferInput(byte[] bArr, int i, int i2) {
        boolean z = false;
        this.isRead = false;
        if (i + i2 <= bArr.length) {
            z = true;
        }
        wpp.a(z);
        this.buffer = MessageBuffer.wrap((byte[]) wpp.a(bArr, (Object) "input array is null")).slice(i, i2);
    }

    public MessageBuffer reset(MessageBuffer messageBuffer) {
        MessageBuffer messageBuffer2 = this.buffer;
        this.buffer = messageBuffer;
        this.isRead = false;
        return messageBuffer2;
    }

    public void reset(byte[] bArr) {
        reset(MessageBuffer.wrap((byte[]) wpp.a(bArr, (Object) "input array is null")));
    }

    public void reset(byte[] bArr, int i, int i2) {
        reset(MessageBuffer.wrap((byte[]) wpp.a(bArr, (Object) "input array is null")).slice(i, i2));
    }

    public MessageBuffer next() {
        if (this.isRead) {
            return null;
        }
        this.isRead = true;
        return this.buffer;
    }

    public void close() {
        this.buffer = null;
        this.isRead = false;
    }
}
