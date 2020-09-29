package defpackage;

/* renamed from: kwx reason: default package */
public final class kwx implements vua<kww> {
    private final wlc<rfu> a;
    private final wlc<gxz> b;
    private final wlc<gzm> c;
    private final wlc<vol> d;
    private final wlc<kvb> e;
    private final wlc<fpt> f;

    private kwx(wlc<rfu> wlc, wlc<gxz> wlc2, wlc<gzm> wlc3, wlc<vol> wlc4, wlc<kvb> wlc5, wlc<fpt> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static kwx a(wlc<rfu> wlc, wlc<gxz> wlc2, wlc<gzm> wlc3, wlc<vol> wlc4, wlc<kvb> wlc5, wlc<fpt> wlc6) {
        kwx kwx = new kwx(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return kwx;
    }

    public final /* synthetic */ Object get() {
        kww kww = new kww((rfu) this.a.get(), (gxz) this.b.get(), (gzm) this.c.get(), (vol) this.d.get(), (kvb) this.e.get(), (fpt) this.f.get());
        return kww;
    }
}
