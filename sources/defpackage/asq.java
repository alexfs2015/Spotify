package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: asq reason: default package */
public final class asq implements asu {
    public long a;
    public int b;
    private final byte[] c = new byte[4096];
    private final bbn d;
    private final long e;
    private byte[] f = new byte[65536];
    private int g;

    public asq(bbn bbn, long j, long j2) {
        this.d = bbn;
        this.a = j;
        this.e = j2;
    }

    public final int a(byte[] bArr, int i, int i2) {
        int d2 = d(bArr, i, i2);
        if (d2 == 0) {
            d2 = a(bArr, i, i2, 0, true);
        }
        g(d2);
        return d2;
    }

    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int d2 = d(bArr, i, i2);
        while (d2 < i2 && d2 != -1) {
            d2 = a(bArr, i, i2, d2, z);
        }
        g(d2);
        return d2 != -1;
    }

    public final void b(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    public final int a(int i) {
        int e2 = e(i);
        if (e2 == 0) {
            e2 = a(this.c, 0, Math.min(i, 4096), 0, true);
        }
        g(e2);
        return e2;
    }

    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f, this.b - i2, bArr, i, i2);
        return true;
    }

    public final void c(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    public final boolean a(int i, boolean z) {
        d(i);
        int min = Math.min(this.g - this.b, i);
        while (min < i) {
            min = a(this.f, this.b, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        this.b += i;
        this.g = Math.max(this.g, this.b);
        return true;
    }

    public final void c(int i) {
        a(i, false);
    }

    public final void a() {
        this.b = 0;
    }

    public final long b() {
        return this.a + ((long) this.b);
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.e;
    }

    private void d(int i) {
        int i2 = this.b + i;
        byte[] bArr = this.f;
        if (i2 > bArr.length) {
            this.f = Arrays.copyOf(this.f, bdw.a(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
    }

    private int e(int i) {
        int min = Math.min(this.g, i);
        f(min);
        return min;
    }

    private int d(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f, 0, bArr, i, min);
        f(min);
        return min;
    }

    private void f(int i) {
        this.g -= i;
        this.b = 0;
        byte[] bArr = this.f;
        int i2 = this.g;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.f, i, bArr, 0, this.g);
        this.f = bArr;
    }

    private int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a2 = this.d.a(bArr, i + i3, i2 - i3);
            if (a2 != -1) {
                return i3 + a2;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private void g(int i) {
        if (i != -1) {
            this.a += (long) i;
        }
    }

    public final void b(int i) {
        int e2 = e(i);
        while (e2 < i && e2 != -1) {
            e2 = a(this.c, -e2, Math.min(i, e2 + 4096), e2, false);
        }
        g(e2);
    }
}
