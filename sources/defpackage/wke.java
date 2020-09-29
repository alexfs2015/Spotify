package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: wke reason: default package */
public class wke implements Closeable {
    private static final Logger a = Logger.getLogger(wke.class.getName());
    /* access modifiers changed from: private */
    public final RandomAccessFile b;
    private int c;
    private int d;
    private a e;
    private a f;
    private final byte[] g = new byte[16];

    /* renamed from: wke$a */
    static class a {
        static final a a = new a(0, 0);
        final int b;
        final int c;

        a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.b);
            sb.append(", length = ");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: wke$b */
    final class b extends InputStream {
        private int a;
        private int b;

        private b(a aVar) {
            this.a = wke.this.b(aVar.b + 4);
            this.b = aVar.c;
        }

        /* synthetic */ b(wke wke, a aVar, byte b2) {
            this(aVar);
        }

        public final int read() {
            if (this.b == 0) {
                return -1;
            }
            wke.this.b.seek((long) this.a);
            int read = wke.this.b.read();
            this.a = wke.this.b(this.a + 1);
            this.b--;
            return read;
        }

        public final int read(byte[] bArr, int i, int i2) {
            wke.b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            wke.this.b(this.a, bArr, i, i2);
            this.a = wke.this.b(this.a + i2);
            this.b -= i2;
            return i2;
        }
    }

    /* renamed from: wke$c */
    public interface c {
        void a(InputStream inputStream, int i);
    }

    /* JADX INFO: finally extract failed */
    public wke(File file) {
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(".tmp");
            File file2 = new File(sb.toString());
            RandomAccessFile a2 = a(file2);
            try {
                a2.setLength(4096);
                a2.seek(0);
                byte[] bArr = new byte[16];
                a(bArr, 4096, 0, 0, 0);
                a2.write(bArr);
                a2.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        this.b = a(file);
        this.b.seek(0);
        this.b.readFully(this.g);
        this.c = a(this.g, 0);
        if (((long) this.c) <= this.b.length()) {
            this.d = a(this.g, 4);
            int a3 = a(this.g, 8);
            int a4 = a(this.g, 12);
            this.e = a(a3);
            this.f = a(a4);
            return;
        }
        StringBuilder sb2 = new StringBuilder("File is truncated. Expected length: ");
        sb2.append(this.c);
        sb2.append(", Actual length: ");
        sb2.append(this.b.length());
        throw new IOException(sb2.toString());
    }

    private static int a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private static RandomAccessFile a(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private a a(int i) {
        if (i == 0) {
            return a.a;
        }
        this.b.seek((long) i);
        return new a(i, this.b.readInt());
    }

    private void a(int i, int i2, int i3, int i4) {
        a(this.g, i, i2, i3, i4);
        this.b.seek(0);
        this.b.write(this.g);
    }

    private void a(int i, byte[] bArr, int i2, int i3) {
        int b2 = b(i);
        int i4 = b2 + i3;
        int i5 = this.c;
        if (i4 <= i5) {
            this.b.seek((long) b2);
            this.b.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - b2;
        this.b.seek((long) b2);
        this.b.write(bArr, i2, i6);
        this.b.seek(16);
        this.b.write(bArr, i2 + i6, i3 - i6);
    }

    private static void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            a(bArr, i, iArr[i2]);
            i += 4;
        }
    }

    /* access modifiers changed from: private */
    public int b(int i) {
        int i2 = this.c;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* access modifiers changed from: private */
    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* access modifiers changed from: private */
    public void b(int i, byte[] bArr, int i2, int i3) {
        int b2 = b(i);
        int i4 = b2 + i3;
        int i5 = this.c;
        if (i4 <= i5) {
            this.b.seek((long) b2);
            this.b.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - b2;
        this.b.seek((long) b2);
        this.b.readFully(bArr, i2, i6);
        this.b.seek(16);
        this.b.readFully(bArr, i2 + i6, i3 - i6);
    }

    private synchronized void b(byte[] bArr, int i, int i2) {
        b(bArr, "buffer");
        if ((i2 | 0) < 0 || i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        c(i2);
        boolean b2 = b();
        a aVar = new a(b2 ? 16 : b(this.f.b + 4 + this.f.c), i2);
        a(this.g, 0, i2);
        a(aVar.b, this.g, 0, 4);
        a(aVar.b + 4, bArr, 0, i2);
        a(this.c, this.d + 1, b2 ? aVar.b : this.e.b, aVar.b);
        this.f = aVar;
        this.d++;
        if (b2) {
            this.e = this.f;
        }
    }

    private void c(int i) {
        int i2 = i + 4;
        int a2 = this.c - a();
        if (a2 < i2) {
            int i3 = this.c;
            do {
                a2 += i3;
                i3 <<= 1;
            } while (a2 < i2);
            d(i3);
            int b2 = b(this.f.b + 4 + this.f.c);
            if (b2 < this.e.b) {
                FileChannel channel = this.b.getChannel();
                channel.position((long) this.c);
                long j = (long) (b2 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f.b < this.e.b) {
                int i4 = (this.c + this.f.b) - 16;
                a(i3, this.d, this.e.b, i4);
                this.f = new a(i4, this.f.c);
            } else {
                a(i3, this.d, this.e.b, this.f.b);
            }
            this.c = i3;
        }
    }

    private synchronized void d() {
        a(4096, 0, 0, 0);
        this.d = 0;
        this.e = a.a;
        this.f = a.a;
        if (this.c > 4096) {
            d(4096);
        }
        this.c = 4096;
    }

    private void d(int i) {
        this.b.setLength((long) i);
        this.b.getChannel().force(true);
    }

    public final int a() {
        if (this.d == 0) {
            return 16;
        }
        return this.f.b >= this.e.b ? (this.f.b - this.e.b) + 4 + this.f.c + 16 : (((this.f.b + 4) + this.f.c) + this.c) - this.e.b;
    }

    public final synchronized void a(c cVar) {
        int i = this.e.b;
        for (int i2 = 0; i2 < this.d; i2++) {
            a a2 = a(i);
            cVar.a(new b(this, a2, 0), a2.c);
            i = b(a2.b + 4 + a2.c);
        }
    }

    public final void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    public final synchronized boolean b() {
        return this.d == 0;
    }

    public final synchronized void c() {
        if (b()) {
            throw new NoSuchElementException();
        } else if (this.d == 1) {
            d();
        } else {
            int b2 = b(this.e.b + 4 + this.e.c);
            b(b2, this.g, 0, 4);
            int a2 = a(this.g, 0);
            a(this.c, this.d - 1, b2, this.f.b);
            this.d--;
            this.e = new a(b2, a2);
        }
    }

    public synchronized void close() {
        this.b.close();
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", first=");
        sb.append(this.e);
        sb.append(", last=");
        sb.append(this.f);
        sb.append(", element lengths=[");
        try {
            a((c) new c() {
                private boolean a = true;

                public final void a(InputStream inputStream, int i) {
                    if (this.a) {
                        this.a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e2) {
            a.log(Level.WARNING, "read error", e2);
        }
        sb.append("]]");
        return sb.toString();
    }
}
