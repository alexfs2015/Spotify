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
    private xfk<? extends T> f;

    static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {
        private xfl<? super T> a;
        private SubscriptionArbiter b;

        FallbackSubscriber(xfl<? super T> xfl, SubscriptionArbiter subscriptionArbiter) {
            this.a = xfl;
            this.b = subscriptionArbiter;
        }

        public final void a(xfm xfm) {
            this.b.b(xfm);
        }

        public final void b_(T t) {
            this.a.b_(t);
        }

        public final void c() {
            this.a.c();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }
    }

    static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final xfl<? super T> downstream;
        xfk<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<xfm> upstream = new AtomicReference<>();
        final Worker worker;

        TimeoutFallbackSubscriber(xfl<? super T> xfl, long j, TimeUnit timeUnit, Worker worker2, xfk<? extends T> xfk) {
            super(true);
            this.downstream = xfl;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker2;
            this.fallback = xfk;
        }

        public final void a() {
            super.a();
            this.worker.bd_();
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                b(xfm);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            DisposableHelper.c(this.task, this.worker.a(new TimeoutTask(j, this), this.timeout, this.unit));
        }

        public final void b_(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).bd_();
                    this.consumed++;
                    this.downstream.b_(t);
                    b(j2);
                }
            }
        }

        public final void c() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bd_();
                this.downstream.c();
                this.worker.bd_();
            }
        }

        public final void c(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.a(this.upstream);
                long j2 = this.consumed;
                if (j2 != 0) {
                    d(j2);
                }
                xfk<? extends T> xfk = this.fallback;
                this.fallback = null;
                xfk.b(new FallbackSubscriber(this.downstream, this));
                this.worker.bd_();
            }
        }

        public final void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bd_();
                this.downstream.onError(th);
                this.worker.bd_();
                return;
            }
            RxJavaPlugins.a(th);
        }
    }

    static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, TimeoutSupport, xfm {
        private static final long serialVersionUID = 3764492702657003550L;
        final xfl<? super T> downstream;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable task = new SequentialDisposable();
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<xfm> upstream = new AtomicReference<>();
        final Worker worker;

        TimeoutSubscriber(xfl<? super T> xfl, long j, TimeUnit timeUnit, Worker worker2) {
            this.downstream = xfl;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker2;
        }

        public final void a() {
            SubscriptionHelper.a(this.upstream);
            this.worker.bd_();
        }

        public final void a(long j) {
            SubscriptionHelper.a(this.upstream, this.requested, j);
        }

        public final void a(xfm xfm) {
            SubscriptionHelper.a(this.upstream, this.requested, xfm);
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            DisposableHelper.c(this.task, this.worker.a(new TimeoutTask(j, this), this.timeout, this.unit));
        }

        public final void b_(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((Disposable) this.task.get()).bd_();
                    this.downstream.b_(t);
                    b(j2);
                }
            }
        }

        public final void c() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bd_();
                this.downstream.c();
                this.worker.bd_();
            }
        }

        public final void c(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.a(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.a(this.timeout, this.unit)));
                this.worker.bd_();
            }
        }

        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.bd_();
                this.downstream.onError(th);
                this.worker.bd_();
                return;
            }
            RxJavaPlugins.a(th);
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

    public FlowableTimeoutTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, xfk<? extends T> xfk) {
        super(flowable);
        this.c = j;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = xfk;
    }

    public final void a(xfl<? super T> xfl) {
        if (this.f == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(xfl, this.c, this.d, this.e.a());
            xfl.a(timeoutSubscriber);
            timeoutSubscriber.b(0);
            this.b.a((FlowableSubscriber<? super T>) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(xfl, this.c, this.d, this.e.a(), this.f);
        xfl.a(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.b(0);
        this.b.a((FlowableSubscriber<? super T>) timeoutFallbackSubscriber);
    }
}
