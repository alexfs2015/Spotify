package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MessageBufferU extends MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public MessageBufferU(ByteBuffer byteBuffer) {
        super(null, 0, byteBuffer.capacity(), byteBuffer.order(ByteOrder.BIG_ENDIAN));
        wpp.a(this.reference);
    }

    MessageBufferU(byte[] bArr) {
        this(ByteBuffer.wrap(bArr));
    }

    public MessageBufferU slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        int i3 = i2 + i;
        wpp.a(i3 <= size());
        try {
            this.reference.position(i);
            this.reference.limit(i3);
            return new MessageBufferU(this.reference.slice());
        } finally {
            resetBufferPosition();
        }
    }

    private void resetBufferPosition() {
        this.reference.position(0);
        this.reference.limit(this.size);
    }

    public byte getByte(int i) {
        return this.reference.get(i);
    }

    public boolean getBoolean(int i) {
        return this.reference.get(i) != 0;
    }

    public short getShort(int i) {
        return this.reference.getShort(i);
    }

    public int getInt(int i) {
        return this.reference.getInt(i);
    }

    public float getFloat(int i) {
        return this.reference.getFloat(i);
    }

    public long getLong(int i) {
        return this.reference.getLong(i);
    }

    public double getDouble(int i) {
        return this.reference.getDouble(i);
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        try {
            this.reference.position(i);
            this.reference.limit(i + i2);
            byteBuffer.put(this.reference);
        } finally {
            resetBufferPosition();
        }
    }

    public void putByte(int i, byte b) {
        this.reference.put(i, b);
    }

    public void putBoolean(int i, boolean z) {
        this.reference.put(i, z ? (byte) 1 : 0);
    }

    public void putShort(int i, short s) {
        this.reference.putShort(i, s);
    }

    public void putInt(int i, int i2) {
        this.reference.putInt(i, i2);
    }

    public void putFloat(int i, float f) {
        this.reference.putFloat(i, f);
    }

    public void putLong(int i, long j) {
        this.reference.putLong(i, j);
    }

    public void putDouble(int i, double d) {
        this.reference.putDouble(i, d);
    }

    public ByteBuffer toByteBuffer(int i, int i2) {
        try {
            this.reference.position(i);
            this.reference.limit(i + i2);
            return this.reference.slice();
        } finally {
            resetBufferPosition();
        }
    }

    public ByteBuffer toByteBuffer() {
        return toByteBuffer(0, this.size);
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        try {
            this.reference.position(i);
            this.reference.get(bArr, i2, i3);
        } finally {
            resetBufferPosition();
        }
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.hasArray()) {
            putBytes(i, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i2);
            byteBuffer.position(byteBuffer.position() + i2);
            return;
        }
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i2);
            this.reference.position(i);
            this.reference.put(byteBuffer);
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        try {
            this.reference.position(i);
            this.reference.put(bArr, i2, i3);
        } finally {
            resetBufferPosition();
        }
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        try {
            this.reference.position(i);
            messageBuffer.putByteBuffer(i2, this.reference, i3);
        } finally {
            resetBufferPosition();
        }
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        getBytes(0, bArr, 0, bArr.length);
        return bArr;
    }
}
