package defpackage;

import io.reactivex.Scheduler;

/* renamed from: obv reason: default package */
public final class obv implements vua<gmi<oas, oau>> {
    private final wlc<glw<oas>> a;
    private final wlc<gmk<oas, oau>> b;
    private final wlc<Scheduler> c;
    private final wlc<oaz> d;
    private final wlc<b> e;
    private final wlc<d> f;

    private obv(wlc<glw<oas>> wlc, wlc<gmk<oas, oau>> wlc2, wlc<Scheduler> wlc3, wlc<oaz> wlc4, wlc<b> wlc5, wlc<d> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static obv a(wlc<glw<oas>> wlc, wlc<gmk<oas, oau>> wlc2, wlc<Scheduler> wlc3, wlc<oaz> wlc4, wlc<b> wlc5, wlc<d> wlc6) {
        obv obv = new obv(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return obv;
    }

    public final /* synthetic */ Object get() {
        gmi gmi = new gmi((glw) this.a.get(), (gmk) this.b.get(), (Scheduler) this.c.get(), (oaz) this.d.get(), (b) this.e.get(), (d) this.f.get());
        return (gmi) vuf.a(gmi, "Cannot return null from a non-@Nullable @Provides method");
    }
}
