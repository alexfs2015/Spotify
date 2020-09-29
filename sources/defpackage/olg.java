package defpackage;

import io.reactivex.Scheduler;

/* renamed from: olg reason: default package */
public final class olg implements vua<olf> {
    private final wlc<oey> a;
    private final wlc<Scheduler> b;

    private olg(wlc<oey> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static olg a(wlc<oey> wlc, wlc<Scheduler> wlc2) {
        return new olg(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new olf((oey) this.a.get(), (Scheduler) this.b.get());
    }
}
