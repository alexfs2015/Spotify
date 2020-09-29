package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: fem reason: default package */
public final class fem {
    static {
        new OutputStream() {
            public final String toString() {
                return "ByteStreams.nullOutputStream()";
            }

            public final void write(int i) {
            }

            public final void write(byte[] bArr) {
                fbp.a(bArr);
            }

            public final void write(byte[] bArr, int i, int i2) {
                fbp.a(bArr);
            }
        };
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        fbp.a(inputStream);
        fbp.a(outputStream);
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static byte[] a(InputStream inputStream) {
        fbp.a(inputStream);
        return a(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] a(InputStream inputStream, Deque<byte[]> deque, int i) {
        int i2 = 8192;
        while (i < 2147483639) {
            byte[] bArr = new byte[Math.min(i2, 2147483639 - i)];
            deque.add(bArr);
            int i3 = 0;
            while (i3 < bArr.length) {
                int read = inputStream.read(bArr, i3, bArr.length - i3);
                if (read == -1) {
                    return a(deque, i);
                }
                i3 += read;
                i += read;
            }
            i2 = fev.b(((long) i2) << 1);
        }
        if (inputStream.read() == -1) {
            return a(deque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] a(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) deque.removeFirst();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
