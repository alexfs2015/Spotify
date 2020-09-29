package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    private long c;
    private TimeUnit d;
    private Scheduler e;
    private wrf<? extends T> f;

    static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {
        private wrg<? super T> a;
        private SubscriptionArbiter b;

        FallbackSubscriber(wrg<? super T> wrg, SubscriptionArbiter subscriptionArbiter) {
            this.a = wrg;
            this.b = subscriptionArbiter;
        }

        public final void a(wrh wrh) {
            this.b.b(wrh);
        }

        public final void b_(T t) {
            this.a.b_(t);
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void c() {
            this.a.c();
        }
    }

    static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final wrg<? super T> downstream;
        wrf<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<wrh> upstream = new AtomicReference<>();
        final Worker worker;

        TimeoutFallbackSubscriber(wrg<? super T> wrg, long j, TimeUnit timeUnit, Worker worker2, wrf<? extends T> wrf) {
            super(true);
            this.downstream = wrg;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker2;
            this.fallback = wrf;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                b(wrh);
            }
        }

        public final void b_(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).bf_();
                    this.consumed++;
                    this.downstream.b_(t);
                    b(j2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            DisposableHelper.c(this.task, this.worker.a(new TimeoutTask(j, this), this.timeout, this.unit));
        }

        public final void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.onError(th);
                this.worker.bf_();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void c() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.c();
                this.worker.bf_();
            }
        }

        public final void c(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.a(this.upstream);
                long j2 = this.consumed;
                if (j2 != 0) {
                    d(j2);
                }
                wrf<? extends T> wrf = this.fallback;
                this.fallback = null;
                wrf.b(new FallbackSubscriber(this.downstream, this));
                this.worker.bf_();
            }
        }

        public final void a() {
            super.a();
            this.worker.bf_();
        }
    }

    static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, TimeoutSupport, wrh {
        private static final long serialVersionUID = 3764492702657003550L;
        final wrg<? super T> downstream;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<wrh> upstream = new AtomicReference<>();
        final Worker worker;

        TimeoutSubscriber(wrg<? super T> wrg, long j, TimeUnit timeUnit, Worker worker2) {
            this.downstream = wrg;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker2;
        }

        public final void a(wrh wrh) {
            SubscriptionHelper.a(this.upstream, this.requested, wrh);
        }

        public final void b_(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).bf_();
                    this.downstream.b_(t);
                    b(j2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            DisposableHelper.c(this.task, this.worker.a(new TimeoutTask(j, this), this.timeout, this.unit));
        }

        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.onError(th);
                this.worker.bf_();
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void c() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bf_();
                this.downstream.c();
                this.worker.bf_();
            }
        }

        public final void c(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.a(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.a(this.timeout, this.unit)));
                this.worker.bf_();
            }
        }

        public final void a(long j) {
            SubscriptionHelper.a(this.upstream, this.requested, j);
        }

        public final void a() {
            SubscriptionHelper.a(this.upstream);
            this.worker.bf_();
        }
    }

    interface TimeoutSupport {
        void c(long j);
    }

    static final class TimeoutTask implements Runnable {
        private TimeoutSupport a;
        private long b;

        TimeoutTask(long j, TimeoutSupport timeoutSupport) {
            this.b = j;
            this.a = timeoutSupport;
        }

        public final void run() {
            this.a.c(this.b);
        }
    }

    public FlowableTimeoutTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, wrf<? extends T> wrf) {
        super(flowable);
        this.c = j;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = wrf;
    }

    public final void a(wrg<? super T> wrg) {
        if (this.f == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(wrg, this.c, this.d, this.e.a());
            wrg.a(timeoutSubscriber);
            timeoutSubscriber.b(0);
            this.b.a((FlowableSubscriber<? super T>) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(wrg, this.c, this.d, this.e.a(), this.f);
        wrg.a(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.b(0);
        this.b.a((FlowableSubscriber<? super T>) timeoutFallbackSubscriber);
    }
}
