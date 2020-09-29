package org.msgpack.core.buffer;

import java.nio.ByteBuffer;

public class MessageBufferBE extends MessageBuffer {
    private MessageBufferBE(Object obj, long j, int i, ByteBuffer byteBuffer) {
        super(obj, j, i, byteBuffer);
    }

    MessageBufferBE(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    MessageBufferBE(byte[] bArr) {
        super(bArr);
    }

    public double getDouble(int i) {
        return unsafe.getDouble(this.base, this.address + ((long) i));
    }

    public float getFloat(int i) {
        return unsafe.getFloat(this.base, this.address + ((long) i));
    }

    public int getInt(int i) {
        return unsafe.getInt(this.base, this.address + ((long) i));
    }

    public long getLong(int i) {
        return unsafe.getLong(this.base, this.address + ((long) i));
    }

    public short getShort(int i) {
        return unsafe.getShort(this.base, this.address + ((long) i));
    }

    public void putDouble(int i, double d) {
        unsafe.putDouble(this.base, this.address + ((long) i), d);
    }

    public void putInt(int i, int i2) {
        unsafe.putInt(this.base, this.address + ((long) i), i2);
    }

    public void putLong(int i, long j) {
        unsafe.putLong(this.base, this.address + ((long) i), j);
    }

    public void putShort(int i, short s) {
        unsafe.putShort(this.base, this.address + ((long) i), s);
    }

    public MessageBufferBE slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        xdu.a(i + i2 <= size());
        MessageBufferBE messageBufferBE = new MessageBufferBE(this.base, this.address + ((long) i), i2, this.reference);
        return messageBufferBE;
    }
}
