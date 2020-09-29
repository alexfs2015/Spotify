package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;

public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    private Predicate<? super Throwable> c;
    private long d;

    static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final xfl<? super T> downstream;
        final Predicate<? super Throwable> predicate;
        long produced;
        long remaining;
        final SubscriptionArbiter sa;
        final xfk<? extends T> source;

        RetrySubscriber(xfl<? super T> xfl, long j, Predicate<? super Throwable> predicate2, SubscriptionArbiter subscriptionArbiter, xfk<? extends T> xfk) {
            this.downstream = xfl;
            this.sa = subscriptionArbiter;
            this.source = xfk;
            this.predicate = predicate2;
            this.remaining = j;
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sa.cancelled) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0;
                        this.sa.d(j);
                    }
                    this.source.b(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }

        public final void a(xfm xfm) {
            this.sa.b(xfm);
        }

        public final void b_(T t) {
            this.produced++;
            this.downstream.b_(t);
        }

        public final void c() {
            this.downstream.c();
        }

        public final void onError(Throwable th) {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
                    this.downstream.onError(th);
                } else {
                    a();
                }
            } catch (Throwable th2) {
                Exceptions.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }
    }

    public FlowableRetryPredicate(Flowable<T> flowable, long j, Predicate<? super Throwable> predicate) {
        super(flowable);
        this.c = predicate;
        this.d = j;
    }

    public final void a(xfl<? super T> xfl) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        xfl.a(subscriptionArbiter);
        RetrySubscriber retrySubscriber = new RetrySubscriber(xfl, this.d, this.c, subscriptionArbiter, this.b);
        retrySubscriber.a();
    }
}
