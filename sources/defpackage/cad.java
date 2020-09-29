package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: cad reason: default package */
public final class cad {
    public static long a(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    a(inputStream);
                    a(outputStream);
                }
            }
        }
        return j;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
