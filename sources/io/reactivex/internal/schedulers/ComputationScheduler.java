package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ComputationScheduler extends Scheduler {
    static final PoolWorker b;
    private static FixedSchedulerPool c;
    private static RxThreadFactory d = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
    private static int e;
    private ThreadFactory f;
    private AtomicReference<FixedSchedulerPool> g;

    static final class EventLoopWorker extends Worker {
        private final ListCompositeDisposable a = new ListCompositeDisposable();
        private final CompositeDisposable b = new CompositeDisposable();
        private final ListCompositeDisposable c = new ListCompositeDisposable();
        private final PoolWorker d;
        private volatile boolean e;

        EventLoopWorker(PoolWorker poolWorker) {
            this.d = poolWorker;
            this.c.a(this.a);
            this.c.a(this.b);
        }

        public final void bf_() {
            if (!this.e) {
                this.e = true;
                this.c.bf_();
            }
        }

        public final boolean b() {
            return this.e;
        }

        public final Disposable a(Runnable runnable) {
            if (this.e) {
                return EmptyDisposable.INSTANCE;
            }
            return this.d.a(runnable, 0, TimeUnit.MILLISECONDS, this.a);
        }

        public final Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.e) {
                return EmptyDisposable.INSTANCE;
            }
            return this.d.a(runnable, j, timeUnit, this.b);
        }
    }

    static final class FixedSchedulerPool {
        private int a;
        private PoolWorker[] b;
        private long c;

        FixedSchedulerPool(int i, ThreadFactory threadFactory) {
            this.a = i;
            this.b = new PoolWorker[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new PoolWorker(threadFactory);
            }
        }

        public final PoolWorker a() {
            int i = this.a;
            if (i == 0) {
                return ComputationScheduler.b;
            }
            PoolWorker[] poolWorkerArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return poolWorkerArr[(int) (j % ((long) i))];
        }

        public final void b() {
            for (PoolWorker bf_ : this.b) {
                bf_.bf_();
            }
        }
    }

    static final class PoolWorker extends NewThreadWorker {
        PoolWorker(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        e = availableProcessors;
        PoolWorker poolWorker = new PoolWorker(new RxThreadFactory("RxComputationShutdown"));
        b = poolWorker;
        poolWorker.bf_();
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(0, d);
        c = fixedSchedulerPool;
        fixedSchedulerPool.b();
    }

    public ComputationScheduler() {
        this(d);
    }

    private ComputationScheduler(ThreadFactory threadFactory) {
        this.f = threadFactory;
        this.g = new AtomicReference<>(c);
        b();
    }

    public final Worker a() {
        return new EventLoopWorker(((FixedSchedulerPool) this.g.get()).a());
    }

    public final Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((FixedSchedulerPool) this.g.get()).a().b(runnable, j, timeUnit);
    }

    public final Disposable a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((FixedSchedulerPool) this.g.get()).a().b(runnable, j, j2, timeUnit);
    }

    public final void b() {
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(e, this.f);
        if (!this.g.compareAndSet(c, fixedSchedulerPool)) {
            fixedSchedulerPool.b();
        }
    }

    public final void c() {
        FixedSchedulerPool fixedSchedulerPool;
        FixedSchedulerPool fixedSchedulerPool2;
        do {
            fixedSchedulerPool = (FixedSchedulerPool) this.g.get();
            fixedSchedulerPool2 = c;
            if (fixedSchedulerPool == fixedSchedulerPool2) {
                return;
            }
        } while (!this.g.compareAndSet(fixedSchedulerPool, fixedSchedulerPool2));
        fixedSchedulerPool.b();
    }
}
