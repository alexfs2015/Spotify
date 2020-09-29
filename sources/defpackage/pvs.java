package defpackage;

/* renamed from: pvs reason: default package */
public final class pvs implements vua<pvr> {
    private final wlc<sgp> a;
    private final wlc<ryz> b;
    private final wlc<sfu> c;
    private final wlc<gxz> d;
    private final wlc<sgn> e;

    private pvs(wlc<sgp> wlc, wlc<ryz> wlc2, wlc<sfu> wlc3, wlc<gxz> wlc4, wlc<sgn> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static pvs a(wlc<sgp> wlc, wlc<ryz> wlc2, wlc<sfu> wlc3, wlc<gxz> wlc4, wlc<sgn> wlc5) {
        pvs pvs = new pvs(wlc, wlc2, wlc3, wlc4, wlc5);
        return pvs;
    }

    public final /* synthetic */ Object get() {
        pvr pvr = new pvr((sgp) this.a.get(), (ryz) this.b.get(), (sfu) this.c.get(), (gxz) this.d.get(), (sgn) this.e.get());
        return pvr;
    }
}
