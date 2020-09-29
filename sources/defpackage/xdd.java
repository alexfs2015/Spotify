package defpackage;

/* renamed from: xdd reason: default package */
public final class xdd {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    boolean e;
    public xdd f;
    public xdd g;

    xdd() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public xdd(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = false;
    }

    /* access modifiers changed from: 0000 */
    public final xdd a() {
        this.d = true;
        xdd xdd = new xdd(this.a, this.b, this.c, true, false);
        return xdd;
    }

    public final xdd a(xdd xdd) {
        xdd.g = this;
        xdd.f = this.f;
        this.f.g = xdd;
        this.f = xdd;
        return xdd;
    }

    public final void a(xdd xdd, int i) {
        if (xdd.e) {
            int i2 = xdd.c;
            if (i2 + i > 8192) {
                if (!xdd.d) {
                    int i3 = i2 + i;
                    int i4 = xdd.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = xdd.a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        xdd.c -= xdd.b;
                        xdd.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, xdd.a, xdd.c, i);
            xdd.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final xdd b() {
        xdd xdd = this.f;
        if (xdd == this) {
            xdd = null;
        }
        xdd xdd2 = this.g;
        xdd2.f = this.f;
        this.f.g = xdd2;
        this.f = null;
        this.g = null;
        return xdd;
    }
}
