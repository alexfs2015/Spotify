package defpackage;

/* renamed from: sdy reason: default package */
public final class sdy implements vua<sdx> {
    private final wlc<sap> a;
    private final wlc<sdi> b;
    private final wlc<sga> c;
    private final wlc<sfe> d;

    private sdy(wlc<sap> wlc, wlc<sdi> wlc2, wlc<sga> wlc3, wlc<sfe> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static sdy a(wlc<sap> wlc, wlc<sdi> wlc2, wlc<sga> wlc3, wlc<sfe> wlc4) {
        return new sdy(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new sdx((sap) this.a.get(), (sdi) this.b.get(), (sga) this.c.get(), (sfe) this.d.get());
    }
}
