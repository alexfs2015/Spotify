package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class IoScheduler extends Scheduler {
    static final RxThreadFactory b;
    static final ThreadWorker c;
    private static RxThreadFactory d;
    private static final long e = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    private static final TimeUnit f = TimeUnit.SECONDS;
    private static CachedWorkerPool i;
    private ThreadFactory g;
    private AtomicReference<CachedWorkerPool> h;

    static final class CachedWorkerPool implements Runnable {
        final long a;
        final ConcurrentLinkedQueue<ThreadWorker> b;
        private CompositeDisposable c;
        private final ScheduledExecutorService d;
        private final Future<?> e;
        private final ThreadFactory f;

        CachedWorkerPool(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            Future<?> future;
            this.a = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.b = new ConcurrentLinkedQueue<>();
            this.c = new CompositeDisposable();
            this.f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, IoScheduler.b);
                long j2 = this.a;
                future = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                future = null;
            }
            this.d = scheduledExecutorService;
            this.e = future;
        }

        static long b() {
            return System.nanoTime();
        }

        /* access modifiers changed from: 0000 */
        public final ThreadWorker a() {
            if (this.c.b()) {
                return IoScheduler.c;
            }
            while (!this.b.isEmpty()) {
                ThreadWorker threadWorker = (ThreadWorker) this.b.poll();
                if (threadWorker != null) {
                    return threadWorker;
                }
            }
            ThreadWorker threadWorker2 = new ThreadWorker(this.f);
            this.c.a((Disposable) threadWorker2);
            return threadWorker2;
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            this.c.bd_();
            Future<?> future = this.e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public final void run() {
            if (!this.b.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ThreadWorker threadWorker = (ThreadWorker) it.next();
                    if (threadWorker.a > nanoTime) {
                        return;
                    }
                    if (this.b.remove(threadWorker)) {
                        this.c.b(threadWorker);
                    }
                }
            }
        }
    }

    static final class EventLoopWorker extends Worker {
        private final CompositeDisposable a;
        private final CachedWorkerPool b;
        private final ThreadWorker c;
        private AtomicBoolean d = new AtomicBoolean();

        EventLoopWorker(CachedWorkerPool cachedWorkerPool) {
            this.b = cachedWorkerPool;
            this.a = new CompositeDisposable();
            this.c = cachedWorkerPool.a();
        }

        public final Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.a.b()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.c.a(runnable, j, timeUnit, this.a);
        }

        public final boolean b() {
            return this.d.get();
        }

        public final void bd_() {
            if (this.d.compareAndSet(false, true)) {
                this.a.bd_();
                CachedWorkerPool cachedWorkerPool = this.b;
                ThreadWorker threadWorker = this.c;
                threadWorker.a = CachedWorkerPool.b() + cachedWorkerPool.a;
                cachedWorkerPool.b.offer(threadWorker);
            }
        }
    }

    static final class ThreadWorker extends NewThreadWorker {
        long a = 0;

        ThreadWorker(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        ThreadWorker threadWorker = new ThreadWorker(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        c = threadWorker;
        threadWorker.bd_();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        d = new RxThreadFactory("RxCachedThreadScheduler", max);
        b = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(0, null, d);
        i = cachedWorkerPool;
        cachedWorkerPool.c();
    }

    public IoScheduler() {
        this(d);
    }

    private IoScheduler(ThreadFactory threadFactory) {
        this.g = threadFactory;
        this.h = new AtomicReference<>(i);
        b();
    }

    public final Worker a() {
        return new EventLoopWorker((CachedWorkerPool) this.h.get());
    }

    public final void b() {
        CachedWorkerPool cachedWorkerPool = new CachedWorkerPool(e, f, this.g);
        if (!this.h.compareAndSet(i, cachedWorkerPool)) {
            cachedWorkerPool.c();
        }
    }

    public final void c() {
        CachedWorkerPool cachedWorkerPool;
        CachedWorkerPool cachedWorkerPool2;
        do {
            cachedWorkerPool = (CachedWorkerPool) this.h.get();
            cachedWorkerPool2 = i;
            if (cachedWorkerPool == cachedWorkerPool2) {
                return;
            }
        } while (!this.h.compareAndSet(cachedWorkerPool, cachedWorkerPool2));
        cachedWorkerPool.c();
    }
}
