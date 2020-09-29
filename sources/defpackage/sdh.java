package defpackage;

import io.reactivex.Scheduler;

/* renamed from: sdh reason: default package */
public final class sdh implements vua<sdg> {
    private final wlc<sfn> a;
    private final wlc<sdx> b;
    private final wlc<Scheduler> c;
    private final wlc<Boolean> d;
    private final wlc<sdi> e;
    private final wlc<Integer> f;

    private sdh(wlc<sfn> wlc, wlc<sdx> wlc2, wlc<Scheduler> wlc3, wlc<Boolean> wlc4, wlc<sdi> wlc5, wlc<Integer> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static sdh a(wlc<sfn> wlc, wlc<sdx> wlc2, wlc<Scheduler> wlc3, wlc<Boolean> wlc4, wlc<sdi> wlc5, wlc<Integer> wlc6) {
        sdh sdh = new sdh(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return sdh;
    }

    public final /* synthetic */ Object get() {
        sdg sdg = new sdg((sfn) this.a.get(), (sdx) this.b.get(), (Scheduler) this.c.get(), ((Boolean) this.d.get()).booleanValue(), (sdi) this.e.get(), ((Integer) this.f.get()).intValue());
        return sdg;
    }
}
