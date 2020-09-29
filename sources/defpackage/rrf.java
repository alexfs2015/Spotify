package defpackage;

import io.reactivex.Scheduler;

/* renamed from: rrf reason: default package */
public final class rrf implements vua<rre> {
    private final wlc<rrg> a;
    private final wlc<Scheduler> b;

    private rrf(wlc<rrg> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rrf a(wlc<rrg> wlc, wlc<Scheduler> wlc2) {
        return new rrf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rre((rrg) this.a.get(), (Scheduler) this.b.get());
    }
}
