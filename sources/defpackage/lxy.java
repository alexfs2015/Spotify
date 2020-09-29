package defpackage;

import io.reactivex.Completable;
import io.reactivex.Scheduler;

/* renamed from: lxy reason: default package */
public final class lxy implements vua<lxx> {
    private final wlc<lyt> a;
    private final wlc<lyu> b;
    private final wlc<Scheduler> c;
    private final wlc<rda> d;
    private final wlc<gyl> e;
    private final wlc<gup> f;
    private final wlc<lxt> g;
    private final wlc<rrj> h;
    private final wlc<Completable> i;
    private final wlc<gzz> j;

    private lxy(wlc<lyt> wlc, wlc<lyu> wlc2, wlc<Scheduler> wlc3, wlc<rda> wlc4, wlc<gyl> wlc5, wlc<gup> wlc6, wlc<lxt> wlc7, wlc<rrj> wlc8, wlc<Completable> wlc9, wlc<gzz> wlc10) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
    }

    public static lxy a(wlc<lyt> wlc, wlc<lyu> wlc2, wlc<Scheduler> wlc3, wlc<rda> wlc4, wlc<gyl> wlc5, wlc<gup> wlc6, wlc<lxt> wlc7, wlc<rrj> wlc8, wlc<Completable> wlc9, wlc<gzz> wlc10) {
        lxy lxy = new lxy(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10);
        return lxy;
    }

    public final /* synthetic */ Object get() {
        lxx lxx = new lxx((lyt) this.a.get(), (lyu) this.b.get(), (Scheduler) this.c.get(), (rda) this.d.get(), (gyl) this.e.get(), (gup) this.f.get(), (lxt) this.g.get(), (rrj) this.h.get(), (Completable) this.i.get(), (gzz) this.j.get());
        return lxx;
    }
}
