package defpackage;

import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: iis reason: default package */
public final class iis {

    /* renamed from: iis$a */
    public static class a {
        final byte a;
        final byte b;

        public a(byte b2, byte b3) {
            this.a = b2;
            this.b = b3;
        }
    }

    public final void a(byte[] bArr, int i, byte b, byte b2, ByteBuffer byteBuffer) {
        iir iir = new iir();
        byteBuffer.put(126);
        byteBuffer.put(iir.a(b));
        byteBuffer.put(iir.a(b2));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        a(allocate.array(), 4, byteBuffer, iir);
        a(bArr, i, byteBuffer, iir);
        ByteBuffer allocate2 = ByteBuffer.allocate(2);
        allocate2.putShort(iir.a());
        a(allocate2.array(), 2, byteBuffer, iir);
        byteBuffer.put(124);
    }

    private static void a(byte[] bArr, int i, ByteBuffer byteBuffer, iir iir) {
        for (int i2 = 0; i2 < i; i2++) {
            byte a2 = iir.a(bArr[i2]);
            if (a2 == 124 || a2 == 126 || a2 == 125) {
                byteBuffer.put(125);
                byteBuffer.put((byte) (a2 - 32));
            } else {
                byteBuffer.put(a2);
            }
        }
    }

    static byte a(DataInput dataInput) {
        try {
            byte readByte = dataInput.readByte();
            while (readByte != 126) {
                readByte = dataInput.readByte();
            }
            return readByte;
        } catch (IOException e) {
            EOFException eOFException = new EOFException("IO exception while waiting for start byte");
            eOFException.initCause(e);
            throw eOFException;
        }
    }
}
