package defpackage;

/* renamed from: rpt reason: default package */
public final class rpt implements vua<rps> {
    private final wlc<rpe> a;
    private final wlc<rox> b;
    private final wlc<rpu> c;
    private final wlc<rpq> d;
    private final wlc<rur> e;

    private rpt(wlc<rpe> wlc, wlc<rox> wlc2, wlc<rpu> wlc3, wlc<rpq> wlc4, wlc<rur> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static rpt a(wlc<rpe> wlc, wlc<rox> wlc2, wlc<rpu> wlc3, wlc<rpq> wlc4, wlc<rur> wlc5) {
        rpt rpt = new rpt(wlc, wlc2, wlc3, wlc4, wlc5);
        return rpt;
    }

    public final /* synthetic */ Object get() {
        rps rps = new rps((rpe) this.a.get(), (rox) this.b.get(), (rpu) this.c.get(), (rpq) this.d.get(), (rur) this.e.get());
        return rps;
    }
}
