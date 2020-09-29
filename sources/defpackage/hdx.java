package defpackage;

/* renamed from: hdx reason: default package */
public final class hdx {
    public int a;
    public int b = 0;
    public int c = 100;
    private final int d = 100;
    private final int e = 15;

    public hdx(int i, int i2) {
    }

    public final boolean a(int i) {
        int i2 = this.b;
        if (i2 != 0) {
            i2 += this.e;
        }
        if (i >= i2) {
            int i3 = this.b + this.c;
            int i4 = this.a;
            if (i3 < i4) {
                i4 = i3 - this.e;
            }
            if (i <= i4) {
                return false;
            }
        }
        return true;
    }

    public final void b(int i) {
        this.b = Math.max(0, i - (this.d / 2));
        this.c = this.d;
    }
}
