package defpackage;

import io.reactivex.Scheduler;

/* renamed from: kcz reason: default package */
public final class kcz implements vua<kcx> {
    private final wlc<ijq> a;
    private final wlc<kda> b;
    private final wlc<kdl> c;
    private final wlc<Scheduler> d;
    private final wlc<Scheduler> e;

    public static kcx a(ijq ijq, kda kda, kdl kdl, Scheduler scheduler, Scheduler scheduler2) {
        kcx kcx = new kcx(ijq, kda, kdl, scheduler, scheduler2);
        return kcx;
    }

    public final /* synthetic */ Object get() {
        kcx kcx = new kcx((ijq) this.a.get(), (kda) this.b.get(), (kdl) this.c.get(), (Scheduler) this.d.get(), (Scheduler) this.e.get());
        return kcx;
    }
}
