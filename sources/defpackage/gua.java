package defpackage;

/* renamed from: gua reason: default package */
public final class gua implements vua<gtz> {
    private final wlc<gsu> a;
    private final wlc<hde> b;

    private gua(wlc<gsu> wlc, wlc<hde> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static gua a(wlc<gsu> wlc, wlc<hde> wlc2) {
        return new gua(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new gtz((gsu) this.a.get(), this.b);
    }
}
