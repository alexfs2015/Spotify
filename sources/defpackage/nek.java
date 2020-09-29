package defpackage;

import io.reactivex.Scheduler;

/* renamed from: nek reason: default package */
public final class nek implements vua<nej> {
    private final wlc<njh> a;
    private final wlc<Scheduler> b;
    private final wlc<nfd> c;
    private final wlc<gup> d;
    private final wlc<spi> e;
    private final wlc<net> f;
    private final wlc<String> g;

    private nek(wlc<njh> wlc, wlc<Scheduler> wlc2, wlc<nfd> wlc3, wlc<gup> wlc4, wlc<spi> wlc5, wlc<net> wlc6, wlc<String> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static nek a(wlc<njh> wlc, wlc<Scheduler> wlc2, wlc<nfd> wlc3, wlc<gup> wlc4, wlc<spi> wlc5, wlc<net> wlc6, wlc<String> wlc7) {
        nek nek = new nek(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return nek;
    }

    public final /* synthetic */ Object get() {
        nej nej = new nej((njh) this.a.get(), (Scheduler) this.b.get(), (nfd) this.c.get(), (gup) this.d.get(), (spi) this.e.get(), (net) this.f.get(), (String) this.g.get());
        return nej;
    }
}
