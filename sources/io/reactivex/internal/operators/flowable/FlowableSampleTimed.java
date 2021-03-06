package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    private long c;
    private TimeUnit d;
    private Scheduler e;
    private boolean f = false;

    static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip = new AtomicInteger(1);

        SampleTimedEmitLast(wrg<? super T> wrg, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(wrg, j, timeUnit, scheduler);
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            d();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.c();
            }
        }

        public final void run() {
            if (this.wip.incrementAndGet() == 2) {
                d();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.c();
                }
            }
        }
    }

    static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(wrg<? super T> wrg, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(wrg, j, timeUnit, scheduler);
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            this.downstream.c();
        }

        public final void run() {
            d();
        }
    }

    static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Runnable, wrh {
        private static final long serialVersionUID = -3517602651313910099L;
        final wrg<? super T> downstream;
        final long period;
        final AtomicLong requested = new AtomicLong();
        final Scheduler scheduler;
        final SequentialDisposable timer = new SequentialDisposable();
        final TimeUnit unit;
        wrh upstream;

        /* access modifiers changed from: 0000 */
        public abstract void b();

        SampleTimedSubscriber(wrg<? super T> wrg, long j, TimeUnit timeUnit, Scheduler scheduler2) {
            this.downstream = wrg;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = scheduler2;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
                SequentialDisposable sequentialDisposable = this.timer;
                Scheduler scheduler2 = this.scheduler;
                long j = this.period;
                DisposableHelper.c(sequentialDisposable, scheduler2.a(this, j, j, this.unit));
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            lazySet(t);
        }

        public void onError(Throwable th) {
            e();
            this.downstream.onError(th);
        }

        public void c() {
            e();
            b();
        }

        private void e() {
            DisposableHelper.a((AtomicReference<Disposable>) this.timer);
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a(this.requested, j);
            }
        }

        public final void a() {
            e();
            this.upstream.a();
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.b_(andSet);
                    BackpressureHelper.c(this.requested, 1);
                    return;
                }
                a();
                this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
            }
        }
    }

    public FlowableSampleTimed(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(flowable);
        this.c = j;
        this.d = timeUnit;
        this.e = scheduler;
    }

    public final void a(wrg<? super T> wrg) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(wrg);
        if (this.f) {
            Flowable flowable = this.b;
            SampleTimedEmitLast sampleTimedEmitLast = new SampleTimedEmitLast(serializedSubscriber, this.c, this.d, this.e);
            flowable.a((FlowableSubscriber<? super T>) sampleTimedEmitLast);
            return;
        }
        Flowable flowable2 = this.b;
        SampleTimedNoLast sampleTimedNoLast = new SampleTimedNoLast(serializedSubscriber, this.c, this.d, this.e);
        flowable2.a((FlowableSubscriber<? super T>) sampleTimedNoLast);
    }
}
