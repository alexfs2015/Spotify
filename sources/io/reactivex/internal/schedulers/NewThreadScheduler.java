package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import java.util.concurrent.ThreadFactory;

public final class NewThreadScheduler extends Scheduler {
    private static final RxThreadFactory c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    private ThreadFactory b;

    public NewThreadScheduler() {
        this(c);
    }

    private NewThreadScheduler(ThreadFactory threadFactory) {
        this.b = threadFactory;
    }

    public final Worker a() {
        return new NewThreadWorker(this.b);
    }
}
