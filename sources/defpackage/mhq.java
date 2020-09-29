package defpackage;

import io.reactivex.Scheduler;

/* renamed from: mhq reason: default package */
public final class mhq implements vua<mhp> {
    private final wlc<mhh> a;
    private final wlc<ufm> b;
    private final wlc<Scheduler> c;

    private mhq(wlc<mhh> wlc, wlc<ufm> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mhq a(wlc<mhh> wlc, wlc<ufm> wlc2, wlc<Scheduler> wlc3) {
        return new mhq(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mhp((mhh) this.a.get(), (ufm) this.b.get(), (Scheduler) this.c.get());
    }
}
