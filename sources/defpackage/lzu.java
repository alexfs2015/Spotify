package defpackage;

import io.reactivex.Scheduler;

/* renamed from: lzu reason: default package */
public final class lzu implements vua<lzt> {
    private final wlc<kvd> a;
    private final wlc<Scheduler> b;

    private lzu(wlc<kvd> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lzu a(wlc<kvd> wlc, wlc<Scheduler> wlc2) {
        return new lzu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new lzt((kvd) this.a.get(), (Scheduler) this.b.get());
    }
}
