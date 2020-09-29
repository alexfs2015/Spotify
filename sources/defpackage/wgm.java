package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: wgm reason: default package */
final class wgm extends InputStream {
    private final InputStream a;
    private long b;
    private long c;
    private long d;
    private long e;

    public wgm(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private wgm(InputStream inputStream, int i) {
        this.e = -1;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 4096);
        }
        this.a = inputStream;
    }

    private void a(long j, long j2) {
        while (j < j2) {
            long skip = this.a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    private void b(long j) {
        try {
            if (this.c >= this.b || this.b > this.d) {
                this.c = this.b;
                this.a.mark((int) (j - this.b));
            } else {
                this.a.reset();
                this.a.mark((int) (j - this.c));
                a(this.c, this.b);
            }
            this.d = j;
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder("Unable to mark: ");
            sb.append(e2);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final long a(int i) {
        long j = this.b + ((long) i);
        if (this.d < j) {
            b(j);
        }
        return this.b;
    }

    public final void a(long j) {
        if (this.b > this.d || j < this.c) {
            throw new IOException("Cannot reset");
        }
        this.a.reset();
        a(this.c, j);
        this.b = j;
    }

    public final int available() {
        return this.a.available();
    }

    public final void close() {
        this.a.close();
    }

    public final void mark(int i) {
        this.e = a(i);
    }

    public final boolean markSupported() {
        return this.a.markSupported();
    }

    public final int read() {
        int read = this.a.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    public final int read(byte[] bArr) {
        int read = this.a.read(bArr);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }

    public final void reset() {
        a(this.e);
    }

    public final long skip(long j) {
        long skip = this.a.skip(j);
        this.b += skip;
        return skip;
    }
}
