package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableIgnoreElements<T> extends AbstractFlowableWithUpstream<T, T> {

    static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, QueueSubscription<T> {
        private xfl<? super T> a;
        private xfm b;

        IgnoreElementsSubscriber(xfl<? super T> xfl) {
            this.a = xfl;
        }

        public final int a(int i) {
            return i & 2;
        }

        public final void a() {
            this.b.a();
        }

        public final void a(long j) {
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.b, xfm)) {
                this.b = xfm;
                this.a.a(this);
                xfm.a(Long.MAX_VALUE);
            }
        }

        public final boolean a(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public final void b_(T t) {
        }

        public final T ba_() {
            return null;
        }

        public final void c() {
            this.a.c();
        }

        public final boolean d() {
            return true;
        }

        public final void e() {
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }
    }

    public FlowableIgnoreElements(Flowable<T> flowable) {
        super(flowable);
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a((FlowableSubscriber<? super T>) new IgnoreElementsSubscriber<Object>(xfl));
    }
}
