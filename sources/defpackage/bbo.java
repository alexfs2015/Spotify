package defpackage;

import java.io.InputStream;

/* renamed from: bbo reason: default package */
public final class bbo extends InputStream {
    private final bbn a;
    private final bbp b;
    private final byte[] c;
    private boolean d = false;
    private boolean e = false;
    private long f;

    public bbo(bbn bbn, bbp bbp) {
        this.a = bbn;
        this.b = bbp;
        this.c = new byte[1];
    }

    public final int read() {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        bcu.b(!this.e);
        a();
        int a2 = this.a.a(bArr, i, i2);
        if (a2 == -1) {
            return -1;
        }
        this.f += (long) a2;
        return a2;
    }

    public final void close() {
        if (!this.e) {
            this.a.c();
            this.e = true;
        }
    }

    public void a() {
        if (!this.d) {
            this.a.a(this.b);
            this.d = true;
        }
    }
}
