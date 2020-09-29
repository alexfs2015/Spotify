package defpackage;

/* renamed from: pvu reason: default package */
public final class pvu implements vua<pvt> {
    private final wlc<saj> a;
    private final wlc<ryz> b;
    private final wlc<sfu> c;
    private final wlc<gxz> d;
    private final wlc<sgn> e;
    private final wlc<sjc> f;
    private final wlc<sjx> g;

    private pvu(wlc<saj> wlc, wlc<ryz> wlc2, wlc<sfu> wlc3, wlc<gxz> wlc4, wlc<sgn> wlc5, wlc<sjc> wlc6, wlc<sjx> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static pvu a(wlc<saj> wlc, wlc<ryz> wlc2, wlc<sfu> wlc3, wlc<gxz> wlc4, wlc<sgn> wlc5, wlc<sjc> wlc6, wlc<sjx> wlc7) {
        pvu pvu = new pvu(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return pvu;
    }

    public final /* synthetic */ Object get() {
        pvt pvt = new pvt((saj) this.a.get(), (ryz) this.b.get(), (sfu) this.c.get(), (gxz) this.d.get(), (sgn) this.e.get(), (sjc) this.f.get(), (sjx) this.g.get());
        return pvt;
    }
}
