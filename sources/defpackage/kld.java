package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;

/* renamed from: kld reason: default package */
public final class kld implements kkv {
    private final Worker a;

    public kld(Scheduler scheduler) {
        this.a = ((Scheduler) kkr.a(scheduler)).a();
    }

    public final void a(Runnable runnable) {
        this.a.a(runnable);
    }

    public final void dispose() {
        this.a.bf_();
    }
}
