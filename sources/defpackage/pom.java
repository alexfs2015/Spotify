package defpackage;

import io.reactivex.Scheduler;

/* renamed from: pom reason: default package */
public final class pom implements vua<pol> {
    private final wlc<psg> a;
    private final wlc<poj> b;
    private final wlc<pqs> c;
    private final wlc<rkd> d;
    private final wlc<Scheduler> e;
    private final wlc<Scheduler> f;

    private pom(wlc<psg> wlc, wlc<poj> wlc2, wlc<pqs> wlc3, wlc<rkd> wlc4, wlc<Scheduler> wlc5, wlc<Scheduler> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static pom a(wlc<psg> wlc, wlc<poj> wlc2, wlc<pqs> wlc3, wlc<rkd> wlc4, wlc<Scheduler> wlc5, wlc<Scheduler> wlc6) {
        pom pom = new pom(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return pom;
    }

    public final /* synthetic */ Object get() {
        pol pol = new pol((psg) this.a.get(), (poj) this.b.get(), (pqs) this.c.get(), (rkd) this.d.get(), (Scheduler) this.e.get(), (Scheduler) this.f.get());
        return pol;
    }
}
