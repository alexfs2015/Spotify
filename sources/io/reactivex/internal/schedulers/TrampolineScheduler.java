package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class TrampolineScheduler extends Scheduler {
    private static final TrampolineScheduler b = new TrampolineScheduler();

    static final class SleepingRunnable implements Runnable {
        private final Runnable a;
        private final TrampolineWorker b;
        private final long c;

        SleepingRunnable(Runnable runnable, TrampolineWorker trampolineWorker, long j) {
            this.a = runnable;
            this.b = trampolineWorker;
            this.c = j;
        }

        public final void run() {
            if (!this.b.b) {
                long a2 = TrampolineWorker.a(TimeUnit.MILLISECONDS);
                long j = this.c;
                if (j > a2) {
                    try {
                        Thread.sleep(j - a2);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        RxJavaPlugins.a((Throwable) e);
                        return;
                    }
                }
                if (!this.b.b) {
                    this.a.run();
                }
            }
        }
    }

    static final class TimedRunnable implements Comparable<TimedRunnable> {
        final Runnable a;
        volatile boolean b;
        private long c;
        private int d;

        public final /* synthetic */ int compareTo(Object obj) {
            TimedRunnable timedRunnable = (TimedRunnable) obj;
            int a2 = ObjectHelper.a(this.c, timedRunnable.c);
            return a2 == 0 ? ObjectHelper.a(this.d, timedRunnable.d) : a2;
        }

        TimedRunnable(Runnable runnable, Long l, int i) {
            this.a = runnable;
            this.c = l.longValue();
            this.d = i;
        }
    }

    static final class TrampolineWorker extends Worker implements Disposable {
        final PriorityBlockingQueue<TimedRunnable> a = new PriorityBlockingQueue<>();
        volatile boolean b;
        private final AtomicInteger c = new AtomicInteger();
        private AtomicInteger d = new AtomicInteger();

        final class AppendToQueueTask implements Runnable {
            private TimedRunnable a;

            AppendToQueueTask(TimedRunnable timedRunnable) {
                this.a = timedRunnable;
            }

            public final void run() {
                this.a.b = true;
                TrampolineWorker.this.a.remove(this.a);
            }
        }

        TrampolineWorker() {
        }

        public final Disposable a(Runnable runnable) {
            return a(runnable, a(TimeUnit.MILLISECONDS));
        }

        public final Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a2 = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return a(new SleepingRunnable(runnable, this, a2), a2);
        }

        private Disposable a(Runnable runnable, long j) {
            if (this.b) {
                return EmptyDisposable.INSTANCE;
            }
            TimedRunnable timedRunnable = new TimedRunnable(runnable, Long.valueOf(j), this.d.incrementAndGet());
            this.a.add(timedRunnable);
            if (this.c.getAndIncrement() != 0) {
                return Disposables.a((Runnable) new AppendToQueueTask(timedRunnable));
            }
            int i = 1;
            while (!this.b) {
                TimedRunnable timedRunnable2 = (TimedRunnable) this.a.poll();
                if (timedRunnable2 == null) {
                    i = this.c.addAndGet(-i);
                    if (i == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!timedRunnable2.b) {
                    timedRunnable2.a.run();
                }
            }
            this.a.clear();
            return EmptyDisposable.INSTANCE;
        }

        public final void bf_() {
            this.b = true;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public static TrampolineScheduler d() {
        return b;
    }

    public final Worker a() {
        return new TrampolineWorker();
    }

    TrampolineScheduler() {
    }

    public final Disposable a(Runnable runnable) {
        RxJavaPlugins.a(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    public final Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            RxJavaPlugins.a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.a((Throwable) e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
