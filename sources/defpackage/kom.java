package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;

/* renamed from: kom reason: default package */
public final class kom implements koe {
    private final Worker a;

    public kom(Scheduler scheduler) {
        this.a = ((Scheduler) koa.a(scheduler)).a();
    }

    public final void a(Runnable runnable) {
        this.a.a(runnable);
    }

    public final void dispose() {
        this.a.bd_();
    }
}
