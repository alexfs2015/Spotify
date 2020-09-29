package defpackage;

/* renamed from: pvy reason: default package */
public final class pvy implements vua<pvx> {
    private final wlc<ryz> a;
    private final wlc<sfu> b;
    private final wlc<sgn> c;
    private final wlc<gys> d;

    private pvy(wlc<ryz> wlc, wlc<sfu> wlc2, wlc<sgn> wlc3, wlc<gys> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pvy a(wlc<ryz> wlc, wlc<sfu> wlc2, wlc<sgn> wlc3, wlc<gys> wlc4) {
        return new pvy(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new pvx((ryz) this.a.get(), (sfu) this.b.get(), (sgn) this.c.get(), (gys) this.d.get());
    }
}
