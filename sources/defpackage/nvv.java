package defpackage;

import io.reactivex.Scheduler;

/* renamed from: nvv reason: default package */
public final class nvv implements vua<nvu> {
    private final wlc<Scheduler> a;
    private final wlc<Scheduler> b;

    public static nvu a(Scheduler scheduler, Scheduler scheduler2) {
        return new nvu(scheduler, scheduler2);
    }

    public final /* synthetic */ Object get() {
        return new nvu((Scheduler) this.a.get(), (Scheduler) this.b.get());
    }
}
