package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.Scheduler.Worker;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;

public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    private long c;
    private TimeUnit d;
    private Scheduler e;
    private boolean f;

    static final class DelaySubscriber<T> implements FlowableSubscriber<T>, xfm {
        final xfl<? super T> a;
        final Worker b;
        private long c;
        private TimeUnit d;
        private boolean e;
        private xfm f;

        final class OnComplete implements Runnable {
            OnComplete() {
            }

            public final void run() {
                try {
                    DelaySubscriber.this.a.c();
                } finally {
                    DelaySubscriber.this.b.bd_();
                }
            }
        }

        final class OnError implements Runnable {
            private final Throwable a;

            OnError(Throwable th) {
                this.a = th;
            }

            public final void run() {
                try {
                    DelaySubscriber.this.a.onError(this.a);
                } finally {
                    DelaySubscriber.this.b.bd_();
                }
            }
        }

        final class OnNext implements Runnable {
            private final T a;

            OnNext(T t) {
                this.a = t;
            }

            public final void run() {
                DelaySubscriber.this.a.b_(this.a);
            }
        }

        DelaySubscriber(xfl<? super T> xfl, long j, TimeUnit timeUnit, Worker worker, boolean z) {
            this.a = xfl;
            this.c = j;
            this.d = timeUnit;
            this.b = worker;
            this.e = z;
        }

        public final void a() {
            this.f.a();
            this.b.bd_();
        }

        public final void a(long j) {
            this.f.a(j);
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.f, xfm)) {
                this.f = xfm;
                this.a.a(this);
            }
        }

        public final void b_(T t) {
            this.b.a(new OnNext(t), this.c, this.d);
        }

        public final void c() {
            this.b.a(new OnComplete(), this.c, this.d);
        }

        public final void onError(Throwable th) {
            this.b.a(new OnError(th), this.e ? this.c : 0, this.d);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(flowable);
        this.c = j;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = z;
    }

    public final void a(xfl<? super T> xfl) {
        xfl<? super T> serializedSubscriber = this.f ? xfl : new SerializedSubscriber<>(xfl);
        Worker a = this.e.a();
        Flowable flowable = this.b;
        DelaySubscriber delaySubscriber = new DelaySubscriber(serializedSubscriber, this.c, this.d, a, this.f);
        flowable.a((FlowableSubscriber<? super T>) delaySubscriber);
    }
}
