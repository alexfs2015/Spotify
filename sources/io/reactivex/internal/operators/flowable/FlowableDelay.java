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

    static final class DelaySubscriber<T> implements FlowableSubscriber<T>, wrh {
        final wrg<? super T> a;
        final Worker b;
        private long c;
        private TimeUnit d;
        private boolean e;
        private wrh f;

        final class OnComplete implements Runnable {
            OnComplete() {
            }

            public final void run() {
                try {
                    DelaySubscriber.this.a.c();
                } finally {
                    DelaySubscriber.this.b.bf_();
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
                    DelaySubscriber.this.b.bf_();
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

        DelaySubscriber(wrg<? super T> wrg, long j, TimeUnit timeUnit, Worker worker, boolean z) {
            this.a = wrg;
            this.c = j;
            this.d = timeUnit;
            this.b = worker;
            this.e = z;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.f, wrh)) {
                this.f = wrh;
                this.a.a(this);
            }
        }

        public final void b_(T t) {
            this.b.a(new OnNext(t), this.c, this.d);
        }

        public final void onError(Throwable th) {
            this.b.a(new OnError(th), this.e ? this.c : 0, this.d);
        }

        public final void c() {
            this.b.a(new OnComplete(), this.c, this.d);
        }

        public final void a(long j) {
            this.f.a(j);
        }

        public final void a() {
            this.f.a();
            this.b.bf_();
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(flowable);
        this.c = j;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = z;
    }

    public final void a(wrg<? super T> wrg) {
        wrg<? super T> wrg2;
        if (this.f) {
            wrg2 = wrg;
        } else {
            wrg2 = new SerializedSubscriber<>(wrg);
        }
        Worker a = this.e.a();
        Flowable flowable = this.b;
        DelaySubscriber delaySubscriber = new DelaySubscriber(wrg2, this.c, this.d, a, this.f);
        flowable.a((FlowableSubscriber<? super T>) delaySubscriber);
    }
}
