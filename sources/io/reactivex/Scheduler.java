package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.NewThreadWorker;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

public abstract class Scheduler {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    static final class DisposeTask implements Disposable, Runnable {
        private Runnable a;
        private Worker b;
        private Thread c;

        DisposeTask(Runnable runnable, Worker worker) {
            this.a = runnable;
            this.b = worker;
        }

        public final void run() {
            this.c = Thread.currentThread();
            try {
                this.a.run();
            } finally {
                bf_();
                this.c = null;
            }
        }

        public final void bf_() {
            if (this.c == Thread.currentThread()) {
                Worker worker = this.b;
                if (worker instanceof NewThreadWorker) {
                    NewThreadWorker newThreadWorker = (NewThreadWorker) worker;
                    if (!newThreadWorker.c) {
                        newThreadWorker.c = true;
                        newThreadWorker.b.shutdown();
                    }
                    return;
                }
            }
            this.b.bf_();
        }

        public final boolean b() {
            return this.b.b();
        }
    }

    static final class PeriodicDirectTask implements Disposable, Runnable {
        private Runnable a;
        private Worker b;
        private volatile boolean c;

        PeriodicDirectTask(Runnable runnable, Worker worker) {
            this.a = runnable;
            this.b = worker;
        }

        public final void run() {
            if (!this.c) {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.b.bf_();
                    throw ExceptionHelper.a(th);
                }
            }
        }

        public final void bf_() {
            this.c = true;
            this.b.bf_();
        }

        public final boolean b() {
            return this.c;
        }
    }

    public static abstract class Worker implements Disposable {

        final class PeriodicTask implements Runnable {
            private Runnable a;
            private SequentialDisposable b;
            private long c;
            private long d;
            private long e;
            private long f;

            PeriodicTask(long j, Runnable runnable, long j2, SequentialDisposable sequentialDisposable, long j3) {
                this.a = runnable;
                this.b = sequentialDisposable;
                this.c = j3;
                this.e = j2;
                this.f = j;
            }

            public final void run() {
                long j;
                this.a.run();
                if (!this.b.b()) {
                    long a2 = Worker.a(TimeUnit.NANOSECONDS);
                    long j2 = Scheduler.a + a2;
                    long j3 = this.e;
                    if (j2 < j3 || a2 >= j3 + this.c + Scheduler.a) {
                        long j4 = this.c;
                        long j5 = a2 + j4;
                        long j6 = this.d + 1;
                        this.d = j6;
                        this.f = j5 - (j4 * j6);
                        j = j5;
                    } else {
                        long j7 = this.f;
                        long j8 = this.d + 1;
                        this.d = j8;
                        j = j7 + (j8 * this.c);
                    }
                    this.e = a2;
                    DisposableHelper.c(this.b, Worker.this.a(this, j - a2, TimeUnit.NANOSECONDS));
                }
            }
        }

        public abstract Disposable a(Runnable runnable, long j, TimeUnit timeUnit);

        public Disposable a(Runnable runnable) {
            return a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        public final Disposable a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable a = RxJavaPlugins.a(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = a(TimeUnit.NANOSECONDS);
            PeriodicTask periodicTask = new PeriodicTask(a2 + timeUnit2.toNanos(j3), a, a2, sequentialDisposable2, nanos);
            Disposable a3 = a(periodicTask, j3, timeUnit2);
            if (a3 == EmptyDisposable.INSTANCE) {
                return a3;
            }
            DisposableHelper.c(sequentialDisposable, a3);
            return sequentialDisposable2;
        }

        public static long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    public abstract Worker a();

    public void b() {
    }

    public void c() {
    }

    public static long a(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public Disposable a(Runnable runnable) {
        return a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public Disposable a(Runnable runnable, long j, TimeUnit timeUnit) {
        Worker a2 = a();
        DisposeTask disposeTask = new DisposeTask(RxJavaPlugins.a(runnable), a2);
        a2.a(disposeTask, j, timeUnit);
        return disposeTask;
    }

    public Disposable a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Worker a2 = a();
        PeriodicDirectTask periodicDirectTask = new PeriodicDirectTask(RxJavaPlugins.a(runnable), a2);
        Disposable a3 = a2.a(periodicDirectTask, j, j2, timeUnit);
        return a3 == EmptyDisposable.INSTANCE ? a3 : periodicDirectTask;
    }
}
