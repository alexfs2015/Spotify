package defpackage;

/* renamed from: ska reason: default package */
public final class ska implements vua<sjx> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;
    private final wlc<sjy> c;

    private ska(wlc<jjf> wlc, wlc<jrp> wlc2, wlc<sjy> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ska a(wlc<jjf> wlc, wlc<jrp> wlc2, wlc<sjy> wlc3) {
        return new ska(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new sjx((jjf) this.a.get(), (jrp) this.b.get(), (sjy) this.c.get());
    }
}
