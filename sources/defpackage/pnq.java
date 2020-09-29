package defpackage;

import io.reactivex.Scheduler;

/* renamed from: pnq reason: default package */
public final class pnq implements vua<pnp> {
    private final wlc<prr> a;
    private final wlc<psi> b;
    private final wlc<psg> c;
    private final wlc<jrp> d;
    private final wlc<hec> e;
    private final wlc<pnt> f;
    private final wlc<poj> g;
    private final wlc<Scheduler> h;
    private final wlc<Scheduler> i;

    private pnq(wlc<prr> wlc, wlc<psi> wlc2, wlc<psg> wlc3, wlc<jrp> wlc4, wlc<hec> wlc5, wlc<pnt> wlc6, wlc<poj> wlc7, wlc<Scheduler> wlc8, wlc<Scheduler> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static pnq a(wlc<prr> wlc, wlc<psi> wlc2, wlc<psg> wlc3, wlc<jrp> wlc4, wlc<hec> wlc5, wlc<pnt> wlc6, wlc<poj> wlc7, wlc<Scheduler> wlc8, wlc<Scheduler> wlc9) {
        pnq pnq = new pnq(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return pnq;
    }

    public final /* synthetic */ Object get() {
        pnp pnp = new pnp((prr) this.a.get(), (psi) this.b.get(), (psg) this.c.get(), (jrp) this.d.get(), (hec) this.e.get(), (pnt) this.f.get(), (poj) this.g.get(), (Scheduler) this.h.get(), (Scheduler) this.i.get());
        return pnp;
    }
}
