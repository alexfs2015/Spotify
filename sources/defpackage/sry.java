package defpackage;

/* renamed from: sry reason: default package */
public final class sry implements vua<srx> {
    private final wlc<ste> a;
    private final wlc<ssw> b;
    private final wlc<tbv> c;
    private final wlc<srv> d;
    private final wlc<sta> e;

    private sry(wlc<ste> wlc, wlc<ssw> wlc2, wlc<tbv> wlc3, wlc<srv> wlc4, wlc<sta> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static sry a(wlc<ste> wlc, wlc<ssw> wlc2, wlc<tbv> wlc3, wlc<srv> wlc4, wlc<sta> wlc5) {
        sry sry = new sry(wlc, wlc2, wlc3, wlc4, wlc5);
        return sry;
    }

    public final /* synthetic */ Object get() {
        srx srx = new srx((ste) this.a.get(), (ssw) this.b.get(), (tbv) this.c.get(), (srv) this.d.get(), (sta) this.e.get());
        return srx;
    }
}
