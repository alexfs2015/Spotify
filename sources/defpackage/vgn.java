package defpackage;

/* renamed from: vgn reason: default package */
final class vgn implements vgo {
    private final int a;
    private final int b;

    vgn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int interpolate(float f) {
        return gd.b(this.a, this.b, f);
    }
}
