package defpackage;

/* renamed from: wox reason: default package */
public final class wox {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    boolean e;
    public wox f;
    public wox g;

    wox() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public wox(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = false;
    }

    /* access modifiers changed from: 0000 */
    public final wox a() {
        this.d = true;
        wox wox = new wox(this.a, this.b, this.c, true, false);
        return wox;
    }

    public final wox b() {
        wox wox = this.f;
        if (wox == this) {
            wox = null;
        }
        wox wox2 = this.g;
        wox2.f = this.f;
        this.f.g = wox2;
        this.f = null;
        this.g = null;
        return wox;
    }

    public final wox a(wox wox) {
        wox.g = this;
        wox.f = this.f;
        this.f.g = wox;
        this.f = wox;
        return wox;
    }

    public final void a(wox wox, int i) {
        if (wox.e) {
            int i2 = wox.c;
            if (i2 + i > 8192) {
                if (!wox.d) {
                    int i3 = i2 + i;
                    int i4 = wox.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = wox.a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        wox.c -= wox.b;
                        wox.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, wox.a, wox.c, i);
            wox.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
