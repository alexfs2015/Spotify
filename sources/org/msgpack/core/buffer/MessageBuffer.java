package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x011d, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011e, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0120, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0121, code lost:
        r9 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065 A[Catch:{ Exception -> 0x0120, all -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067 A[Catch:{ Exception -> 0x0120, all -> 0x011d }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0163  */
    static {
        /*
            java.lang.String r0 = "org.msgpack.core.buffer.MessageBuffer"
            java.lang.String r1 = "org.msgpack.core.buffer.MessageBufferBE"
            java.lang.String r2 = ""
            java.lang.String r3 = "org.msgpack.core.buffer.MessageBufferU"
            java.lang.Class<byte[]> r4 = byte[].class
            r5 = 16
            r6 = 0
            r7 = 0
            r8 = 1
            java.lang.String r9 = "java.specification.version"
            java.lang.String r9 = java.lang.System.getProperty(r9, r2)     // Catch:{ Exception -> 0x0120, all -> 0x011d }
            r10 = 46
            int r10 = r9.indexOf(r10)     // Catch:{ Exception -> 0x0120, all -> 0x011d }
            r11 = -1
            if (r10 == r11) goto L_0x0037
            java.lang.String r11 = r9.substring(r7, r10)     // Catch:{ NumberFormatException -> 0x003b }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x003b }
            int r10 = r10 + r8
            java.lang.String r9 = r9.substring(r10)     // Catch:{ NumberFormatException -> 0x003b }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x003b }
            if (r11 > r8) goto L_0x0039
            if (r11 != r8) goto L_0x0037
            r10 = 7
            if (r9 < r10) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r9 = 0
            goto L_0x0042
        L_0x0039:
            r9 = 1
            goto L_0x0042
        L_0x003b:
            r9 = move-exception
            java.io.PrintStream r10 = java.lang.System.err     // Catch:{ Exception -> 0x0120, all -> 0x011d }
            r9.printStackTrace(r10)     // Catch:{ Exception -> 0x0120, all -> 0x011d }
            goto L_0x0037
        L_0x0042:
            java.lang.String r10 = "sun.misc.Unsafe"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ Exception -> 0x004c, all -> 0x011d }
            if (r10 == 0) goto L_0x004c
            r10 = 1
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            java.lang.String r11 = "java.runtime.name"
            java.lang.String r2 = java.lang.System.getProperty(r11, r2)     // Catch:{ Exception -> 0x0120, all -> 0x011d }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x0120, all -> 0x011d }
            java.lang.String r11 = "android"
            boolean r2 = r2.contains(r11)     // Catch:{ Exception -> 0x0120, all -> 0x011d }
            java.lang.String r11 = "com.google.appengine.runtime.version"
            java.lang.String r11 = java.lang.System.getProperty(r11)     // Catch:{ Exception -> 0x0120, all -> 0x011d }
            if (r11 == 0) goto L_0x0067
            r11 = 1
            goto L_0x0068
        L_0x0067:
            r11 = 0
        L_0x0068:
            java.lang.String r12 = "msgpack.universal-buffer"
            java.lang.String r13 = "false"
            java.lang.String r12 = java.lang.System.getProperty(r12, r13)     // Catch:{ Exception -> 0x0120, all -> 0x011d }
            boolean r12 = java.lang.Boolean.parseBoolean(r12)     // Catch:{ Exception -> 0x0120, all -> 0x011d }
            if (r12 != 0) goto L_0x0081
            if (r2 != 0) goto L_0x0081
            if (r11 != 0) goto L_0x0081
            if (r9 == 0) goto L_0x0081
            if (r10 != 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r2 = 0
            goto L_0x0082
        L_0x0081:
            r2 = 1
        L_0x0082:
            if (r2 != 0) goto L_0x00d7
            java.lang.Class<sun.misc.Unsafe> r9 = sun.misc.Unsafe.class
            java.lang.String r10 = "theUnsafe"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r10)     // Catch:{ Exception -> 0x00d2, all -> 0x00cc }
            r9.setAccessible(r8)     // Catch:{ Exception -> 0x00d2, all -> 0x00cc }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x00d2, all -> 0x00cc }
            sun.misc.Unsafe r9 = (sun.misc.Unsafe) r9     // Catch:{ Exception -> 0x00d2, all -> 0x00cc }
            if (r9 == 0) goto L_0x00b7
            int r5 = r9.arrayBaseOffset(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
            int r6 = r9.arrayIndexScale(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
            if (r6 != r8) goto L_0x00a3
            r6 = r9
            goto L_0x00d7
        L_0x00a3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
            java.lang.String r12 = "Byte array index scale must be 1, but is "
            r11.<init>(r12)     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
            r11.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
            java.lang.String r6 = r11.toString()     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
            r10.<init>(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
            throw r10     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
        L_0x00b7:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
            java.lang.String r10 = "Unsafe is unavailable"
            r6.<init>(r10)     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
            throw r6     // Catch:{ Exception -> 0x00c6, all -> 0x00bf }
        L_0x00bf:
            r6 = move-exception
            r14 = r9
            r9 = r2
            r2 = r6
            r6 = r14
            goto L_0x015b
        L_0x00c6:
            r6 = move-exception
            r14 = r9
            r9 = r2
            r2 = r6
            r6 = r14
            goto L_0x0122
        L_0x00cc:
            r9 = move-exception
            r14 = r9
            r9 = r2
            r2 = r14
            goto L_0x015b
        L_0x00d2:
            r9 = move-exception
            r14 = r9
            r9 = r2
            r2 = r14
            goto L_0x0122
        L_0x00d7:
            unsafe = r6
            ARRAY_BYTE_BASE_OFFSET = r5
            isUniversalBuffer = r2
            if (r2 == 0) goto L_0x00e0
            goto L_0x00f0
        L_0x00e0:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r2 != r3) goto L_0x00ea
            r2 = 1
            goto L_0x00eb
        L_0x00ea:
            r2 = 0
        L_0x00eb:
            if (r2 == 0) goto L_0x00ef
            r3 = r0
            goto L_0x00f0
        L_0x00ef:
            r3 = r1
        L_0x00f0:
            java.lang.Class r0 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x0111 }
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0111 }
            r1[r7] = r4     // Catch:{ Exception -> 0x0111 }
            java.lang.reflect.Constructor r1 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x0111 }
            r1.setAccessible(r8)     // Catch:{ Exception -> 0x0111 }
            mbArrConstructor = r1     // Catch:{ Exception -> 0x0111 }
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0111 }
            java.lang.Class<java.nio.ByteBuffer> r2 = java.nio.ByteBuffer.class
            r1[r7] = r2     // Catch:{ Exception -> 0x0111 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x0111 }
            r0.setAccessible(r8)     // Catch:{ Exception -> 0x0111 }
            mbBBConstructor = r0     // Catch:{ Exception -> 0x0111 }
            goto L_0x014d
        L_0x0111:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x011d:
            r2 = move-exception
            r9 = 0
            goto L_0x015b
        L_0x0120:
            r2 = move-exception
            r9 = 0
        L_0x0122:
            java.io.PrintStream r10 = java.lang.System.err     // Catch:{ all -> 0x015a }
            r2.printStackTrace(r10)     // Catch:{ all -> 0x015a }
            unsafe = r6
            ARRAY_BYTE_BASE_OFFSET = r5
            isUniversalBuffer = r8
            java.lang.Class r0 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x014e }
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x014e }
            r1[r7] = r4     // Catch:{ Exception -> 0x014e }
            java.lang.reflect.Constructor r1 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x014e }
            r1.setAccessible(r8)     // Catch:{ Exception -> 0x014e }
            mbArrConstructor = r1     // Catch:{ Exception -> 0x014e }
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x014e }
            java.lang.Class<java.nio.ByteBuffer> r2 = java.nio.ByteBuffer.class
            r1[r7] = r2     // Catch:{ Exception -> 0x014e }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x014e }
            r0.setAccessible(r8)     // Catch:{ Exception -> 0x014e }
            mbBBConstructor = r0     // Catch:{ Exception -> 0x014e }
        L_0x014d:
            return
        L_0x014e:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x015a:
            r2 = move-exception
        L_0x015b:
            unsafe = r6
            ARRAY_BYTE_BASE_OFFSET = r5
            isUniversalBuffer = r9
            if (r9 != 0) goto L_0x0173
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r3 != r5) goto L_0x016d
            r3 = 1
            goto L_0x016e
        L_0x016d:
            r3 = 0
        L_0x016e:
            if (r3 == 0) goto L_0x0172
            r3 = r0
            goto L_0x0173
        L_0x0172:
            r3 = r1
        L_0x0173:
            java.lang.Class r0 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x0194 }
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0194 }
            r1[r7] = r4     // Catch:{ Exception -> 0x0194 }
            java.lang.reflect.Constructor r1 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x0194 }
            r1.setAccessible(r8)     // Catch:{ Exception -> 0x0194 }
            mbArrConstructor = r1     // Catch:{ Exception -> 0x0194 }
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0194 }
            java.lang.Class<java.nio.ByteBuffer> r3 = java.nio.ByteBuffer.class
            r1[r7] = r3     // Catch:{ Exception -> 0x0194 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x0194 }
            r0.setAccessible(r8)     // Catch:{ Exception -> 0x0194 }
            mbBBConstructor = r0     // Catch:{ Exception -> 0x0194 }
            throw r2
        L_0x0194:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            r0.printStackTrace(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            goto L_0x01a1
        L_0x01a0:
            throw r1
        L_0x01a1:
            goto L_0x01a0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.MessageBuffer.<clinit>():void");
    }

    MessageBuffer(long j, int i) {
        this.base = null;
        this.address = j;
        this.size = i;
        this.reference = null;
    }

    MessageBuffer(Object obj, long j, int i, ByteBuffer byteBuffer) {
        this.base = obj;
        this.address = j;
        this.size = i;
        this.reference = byteBuffer;
    }

    MessageBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (!isUniversalBuffer) {
                this.base = null;
                this.address = DirectBufferAccess.getAddress(byteBuffer);
                this.size = byteBuffer.capacity();
                this.reference = byteBuffer;
                return;
            }
            throw new IllegalStateException("Cannot create MessageBuffer from DirectBuffer");
        } else if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = (long) ARRAY_BYTE_BASE_OFFSET;
            this.size = byteBuffer.array().length;
            this.reference = null;
        } else {
            throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer are supported");
        }
    }

    MessageBuffer(byte[] bArr) {
        this.base = bArr;
        this.address = (long) ARRAY_BYTE_BASE_OFFSET;
        this.size = bArr.length;
        this.reference = null;
    }

    public static MessageBuffer newBuffer(int i) {
        return newMessageBuffer(new byte[i]);
    }

    public static MessageBuffer newDirectBuffer(int i) {
        return newMessageBuffer(ByteBuffer.allocateDirect(i));
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        xdu.a(byteBuffer);
        try {
            return (MessageBuffer) mbBBConstructor.newInstance(new Object[]{byteBuffer});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr) {
        xdu.a(bArr);
        try {
            return (MessageBuffer) mbArrConstructor.newInstance(new Object[]{bArr});
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    static MessageBuffer newOffHeapBuffer(int i) {
        return !isUniversalBuffer ? new MessageBuffer(unsafe.allocateMemory((long) i), i) : newDirectBuffer(i);
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (!isUniversalBuffer) {
            Object obj = messageBuffer.base;
            if (!(obj instanceof byte[])) {
                if (DirectBufferAccess.isDirectByteBufferInstance(obj)) {
                    DirectBufferAccess.clean(messageBuffer.base);
                    return;
                }
                unsafe.freeMemory(messageBuffer.address);
            }
        }
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer).slice(byteBuffer.position(), byteBuffer.remaining());
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr);
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), messageBuffer.base, ((long) i2) + messageBuffer.address, (long) i3);
    }

    public long getAddress() {
        return this.address;
    }

    public byte[] getArray() {
        return (byte[]) this.base;
    }

    public Object getBase() {
        return this.base;
    }

    public boolean getBoolean(int i) {
        return unsafe.getBoolean(this.base, this.address + ((long) i));
    }

    public byte getByte(int i) {
        return unsafe.getByte(this.base, this.address + ((long) i));
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= i2) {
            byteBuffer.put(toByteBuffer(i, i2));
            return;
        }
        throw new BufferOverflowException();
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), bArr, (long) (ARRAY_BYTE_BASE_OFFSET + i2), (long) i3);
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public int getInt(int i) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + ((long) i)));
    }

    public long getLong(int i) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + ((long) i)));
    }

    public ByteBuffer getReference() {
        return this.reference;
    }

    public short getShort(int i) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + ((long) i)));
    }

    public boolean hasArray() {
        return this.base instanceof byte[];
    }

    public int offset() {
        if (hasArray()) {
            return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
        }
        return 0;
    }

    public void putBoolean(int i, boolean z) {
        unsafe.putBoolean(this.base, this.address + ((long) i), z);
    }

    public void putByte(int i, byte b) {
        unsafe.putByte(this.base, this.address + ((long) i), b);
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory(null, DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position()), this.base, this.address + ((long) i), (long) i2);
            byteBuffer.position(byteBuffer.position() + i2);
        } else if (byteBuffer.hasArray()) {
            unsafe.copyMemory(byteBuffer.array(), (long) (ARRAY_BYTE_BASE_OFFSET + byteBuffer.position()), this.base, this.address + ((long) i), (long) i2);
            byteBuffer.position(byteBuffer.position() + i2);
        } else {
            Object obj = this.base;
            if (obj != null) {
                byteBuffer.get((byte[]) obj, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                unsafe.putByte(this.base, this.address + ((long) i), byteBuffer.get());
            }
        }
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(bArr, (long) (ARRAY_BYTE_BASE_OFFSET + i2), this.base, this.address + ((long) i), (long) i3);
    }

    public void putDouble(int i, double d) {
        putLong(i, Double.doubleToRawLongBits(d));
    }

    public void putFloat(int i, float f) {
        putInt(i, Float.floatToRawIntBits(f));
    }

    public void putInt(int i, int i2) {
        unsafe.putInt(this.base, this.address + ((long) i), Integer.reverseBytes(i2));
    }

    public void putLong(int i, long j) {
        unsafe.putLong(this.base, ((long) i) + this.address, Long.reverseBytes(j));
    }

    public void putShort(int i, short s) {
        unsafe.putShort(this.base, this.address + ((long) i), Short.reverseBytes(s));
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        xdu.a(i + i2 <= size());
        MessageBuffer messageBuffer = new MessageBuffer(this.base, this.address + ((long) i), i2, this.reference);
        return messageBuffer;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        unsafe.copyMemory(this.base, this.address, bArr, (long) ARRAY_BYTE_BASE_OFFSET, (long) size());
        return bArr;
    }

    public ByteBuffer toByteBuffer() {
        return toByteBuffer(0, size());
    }

    public ByteBuffer toByteBuffer(int i, int i2) {
        return hasArray() ? ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ((long) ARRAY_BYTE_BASE_OFFSET)) + ((long) i)), i2) : DirectBufferAccess.newByteBuffer(this.address, i, i2, this.reference);
    }

    public String toHexString(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 != i) {
                sb.append(" ");
            }
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(getByte(i3))}));
        }
        return sb.toString();
    }
}
