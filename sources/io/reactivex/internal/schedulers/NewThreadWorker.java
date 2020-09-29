package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class NewThreadWorker extends Worker implements Disposable {
    public final ScheduledExecutorService b;
    public volatile boolean c;

    public NewThreadWorker(ThreadFactory threadFactory) {
        this.b = SchedulerPoolFactory.a(threadFactory);
    }

    public final Disposable a(Runnable runnable) {
        return a(runnable, 0, null);
    }

    public final Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.c) {
            return EmptyDisposable.INSTANCE;
        }
        return a(runnable, j, timeUnit, null);
    }

    public final Disposable b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.a(runnable));
        if (j <= 0) {
            try {
                future = this.b.submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.a((Throwable) e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.b.schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.a(future);
        return scheduledDirectTask;
    }

    public final Disposable b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = RxJavaPlugins.a(runnable);
        if (j2 <= 0) {
            InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(a, this.b);
            if (j <= 0) {
                try {
                    future = this.b.submit(instantPeriodicTask);
                } catch (RejectedExecutionException e) {
                    RxJavaPlugins.a((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.b.schedule(instantPeriodicTask, j, timeUnit);
            }
            instantPeriodicTask.a(future);
            return instantPeriodicTask;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(a);
        try {
            scheduledDirectPeriodicTask.a(this.b.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.a((Throwable) e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    public final ScheduledRunnable a(Runnable runnable, long j, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        Future future;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.a(runnable), disposableContainer);
        if (disposableContainer != null && !disposableContainer.a(scheduledRunnable)) {
            return scheduledRunnable;
        }
        if (j <= 0) {
            try {
                future = this.b.submit(scheduledRunnable);
            } catch (RejectedExecutionException e) {
                if (disposableContainer != null) {
                    disposableContainer.b(scheduledRunnable);
                }
                RxJavaPlugins.a((Throwable) e);
            }
        } else {
            future = this.b.schedule(scheduledRunnable, j, timeUnit);
        }
        scheduledRunnable.a(future);
        return scheduledRunnable;
    }

    public void bf_() {
        if (!this.c) {
            this.c = true;
            this.b.shutdownNow();
        }
    }

    public final boolean b() {
        return this.c;
    }
}
