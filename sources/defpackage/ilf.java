package defpackage;

import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ilf reason: default package */
public final class ilf {

    /* renamed from: ilf$a */
    public static class a {
        final byte a;
        final byte b;

        public a(byte b2, byte b3) {
            this.a = b2;
            this.b = b3;
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

    private static void a(byte[] bArr, int i, ByteBuffer byteBuffer, ile ile) {
        for (int i2 = 0; i2 < i; i2++) {
            byte a2 = ile.a(bArr[i2]);
            if (a2 == 124 || a2 == 126 || a2 == 125) {
                byteBuffer.put(125);
                byteBuffer.put((byte) (a2 - 32));
            } else {
                byteBuffer.put(a2);
            }
        }
    }

    public final void a(byte[] bArr, int i, byte b, byte b2, ByteBuffer byteBuffer) {
        ile ile = new ile();
        byteBuffer.put(126);
        byteBuffer.put(ile.a(b));
        byteBuffer.put(ile.a(b2));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        a(allocate.array(), 4, byteBuffer, ile);
        a(bArr, i, byteBuffer, ile);
        ByteBuffer allocate2 = ByteBuffer.allocate(2);
        allocate2.putShort(ile.a());
        a(allocate2.array(), 2, byteBuffer, ile);
        byteBuffer.put(124);
    }
}
