package defpackage;

import io.reactivex.Scheduler;

/* renamed from: rff reason: default package */
public final class rff implements vua<rfe> {
    private final wlc<rnf> a;
    private final wlc<Scheduler> b;

    private rff(wlc<rnf> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rff a(wlc<rnf> wlc, wlc<Scheduler> wlc2) {
        return new rff(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rfe((rnf) this.a.get(), (Scheduler) this.b.get());
    }
}
