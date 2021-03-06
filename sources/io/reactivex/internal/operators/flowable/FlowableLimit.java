package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {
    private long c;

    static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, wrh {
        private static final long serialVersionUID = 2288246011222124525L;
        final wrg<? super T> downstream;
        long remaining;
        wrh upstream;

        LimitSubscriber(wrg<? super T> wrg, long j) {
            this.downstream = wrg;
            this.remaining = j;
            lazySet(j);
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                if (this.remaining == 0) {
                    wrh.a();
                    EmptySubscription.a(this.downstream);
                    return;
                }
                this.upstream = wrh;
                this.downstream.a(this);
            }
        }

        public final void b_(T t) {
            long j = this.remaining;
            if (j > 0) {
                long j2 = j - 1;
                this.remaining = j2;
                this.downstream.b_(t);
                if (j2 == 0) {
                    this.upstream.a();
                    this.downstream.c();
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.remaining > 0) {
                this.remaining = 0;
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void c() {
            if (this.remaining > 0) {
                this.remaining = 0;
                this.downstream.c();
            }
        }

        public final void a(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.b(j)) {
                do {
                    j2 = get();
                    if (j2 != 0) {
                        j3 = j2 <= j ? j2 : j;
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j2 - j3));
                this.upstream.a(j3);
            }
        }

        public final void a() {
            this.upstream.a();
        }
    }

    public FlowableLimit(Flowable<T> flowable, long j) {
        super(flowable);
        this.c = j;
    }

    public final void a(wrg<? super T> wrg) {
        this.b.a((FlowableSubscriber<? super T>) new LimitSubscriber<Object>(wrg, this.c));
    }
}
