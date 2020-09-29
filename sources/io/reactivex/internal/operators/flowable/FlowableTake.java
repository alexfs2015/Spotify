package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    private long c;

    static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, xfm {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final xfl<? super T> downstream;
        final long limit;
        long remaining;
        xfm upstream;

        TakeSubscriber(xfl<? super T> xfl, long j) {
            this.downstream = xfl;
            this.limit = j;
            this.remaining = j;
        }

        public final void a() {
            this.upstream.a();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                if (get() || !compareAndSet(false, true) || j < this.limit) {
                    this.upstream.a(j);
                } else {
                    this.upstream.a(Long.MAX_VALUE);
                }
            }
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                if (this.limit == 0) {
                    xfm.a();
                    this.done = true;
                    EmptySubscription.a(this.downstream);
                    return;
                }
                this.downstream.a(this);
            }
        }

        public final void b_(T t) {
            if (!this.done) {
                long j = this.remaining;
                this.remaining = j - 1;
                if (j > 0) {
                    boolean z = this.remaining == 0;
                    this.downstream.b_(t);
                    if (z) {
                        this.upstream.a();
                        c();
                    }
                }
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                this.downstream.c();
            }
        }

        public final void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.upstream.a();
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.a(th);
        }
    }

    public FlowableTake(Flowable<T> flowable, long j) {
        super(flowable);
        this.c = j;
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a((FlowableSubscriber<? super T>) new TakeSubscriber<Object>(xfl, this.c));
    }
}
