package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableOnBackpressureError<T> extends AbstractFlowableWithUpstream<T, T> {

    static final class BackpressureErrorSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, xfm {
        private static final long serialVersionUID = -3176480756392482682L;
        boolean done;
        final xfl<? super T> downstream;
        xfm upstream;

        BackpressureErrorSubscriber(xfl<? super T> xfl) {
            this.downstream = xfl;
        }

        public final void a() {
            this.upstream.a();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a((AtomicLong) this, j);
            }
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.upstream, xfm)) {
                this.upstream = xfm;
                this.downstream.a(this);
                xfm.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            if (!this.done) {
                if (get() != 0) {
                    this.downstream.b_(t);
                    BackpressureHelper.c(this, 1);
                    return;
                }
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                this.downstream.c();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.a(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }
    }

    public FlowableOnBackpressureError(Flowable<T> flowable) {
        super(flowable);
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a((FlowableSubscriber<? super T>) new BackpressureErrorSubscriber<Object>(xfl));
    }
}
