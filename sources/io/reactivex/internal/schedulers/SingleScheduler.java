package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleScheduler extends Scheduler {
    private static RxThreadFactory d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    private static ScheduledExecutorService e;
    private ThreadFactory b;
    private AtomicReference<ScheduledExecutorService> c;

    static final class ScheduledWorker extends Worker {
        private ScheduledExecutorService a;
        private CompositeDisposable b = new CompositeDisposable();
        private volatile boolean c;

        ScheduledWorker(ScheduledExecutorService scheduledExecutorService) {
            this.a = scheduledExecutorService;
        }

        public final Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.c) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.a(runnable), this.b);
            this.b.a((Disposable) scheduledRunnable);
            if (j <= 0) {
                try {
                    future = this.a.submit(scheduledRunnable);
                } catch (RejectedExecutionException e) {
                    bf_();
                    RxJavaPlugins.a((Throwable) e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.a.schedule(scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.a(future);
            return scheduledRunnable;
        }

        public final void bf_() {
            if (!this.c) {
                this.c = true;
                this.b.bf_();
            }
        }

        public final boolean b() {
            return this.c;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public SingleScheduler() {
        this(d);
    }

    private SingleScheduler(ThreadFactory threadFactory) {
        this.c = new AtomicReference<>();
        this.b = threadFactory;
        this.c.lazySet(SchedulerPoolFactory.a(threadFactory));
    }

    public final void b() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = (ScheduledExecutorService) this.c.get();
            if (scheduledExecutorService != e) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = SchedulerPoolFactory.a(this.b);
            }
        } while (!this.c.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    public final void c() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.get();
        ScheduledExecutorService scheduledExecutorService2 = e;
        if (scheduledExecutorService != scheduledExecutorService2) {
            ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.c.getAndSet(scheduledExecutorService2);
            if (scheduledExecutorService3 != e) {
                scheduledExecutorService3.shutdownNow();
            }
        }
    }

    public final Worker a() {
        return new ScheduledWorker((ScheduledExecutorService) this.c.get());
    }

    public final Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.a(runnable));
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.c.get()).submit(scheduledDirectTask);
            } catch (RejectedExecutionException e2) {
                RxJavaPlugins.a((Throwable) e2);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.c.get()).schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.a(future);
        return scheduledDirectTask;
    }

    public final Disposable a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = RxJavaPlugins.a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.get();
            InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(a, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(instantPeriodicTask);
                } catch (RejectedExecutionException e2) {
                    RxJavaPlugins.a((Throwable) e2);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(instantPeriodicTask, j, timeUnit);
            }
            instantPeriodicTask.a(future);
            return instantPeriodicTask;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(a);
        try {
            scheduledDirectPeriodicTask.a(((ScheduledExecutorService) this.c.get()).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e3) {
            RxJavaPlugins.a((Throwable) e3);
            return EmptyDisposable.INSTANCE;
        }
    }
}
