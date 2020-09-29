package defpackage;

import io.reactivex.Scheduler;

/* renamed from: swq reason: default package */
public final class swq implements vua<swp> {
    private final wlc<idq> a;
    private final wlc<Scheduler> b;
    private final wlc<Scheduler> c;

    private swq(wlc<idq> wlc, wlc<Scheduler> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static swq a(wlc<idq> wlc, wlc<Scheduler> wlc2, wlc<Scheduler> wlc3) {
        return new swq(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new swp((idq) this.a.get(), (Scheduler) this.b.get(), (Scheduler) this.c.get());
    }
}
