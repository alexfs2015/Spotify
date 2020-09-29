package defpackage;

import io.reactivex.Scheduler;

/* renamed from: htf reason: default package */
public final class htf implements vua<hte> {
    private final wlc<htc> a;
    private final wlc<Scheduler> b;

    private htf(wlc<htc> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static htf a(wlc<htc> wlc, wlc<Scheduler> wlc2) {
        return new htf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hte((htc) this.a.get(), (Scheduler) this.b.get());
    }
}
