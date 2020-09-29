package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class FlowableIgnoreElements<T> extends AbstractFlowableWithUpstream<T, T> {

    static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, QueueSubscription<T> {
        private wrg<? super T> a;
        private wrh b;

        public final int a(int i) {
            return i & 2;
        }

        public final void a(long j) {
        }

        public final void b_(T t) {
        }

        public final T bc_() {
            return null;
        }

        public final boolean d() {
            return true;
        }

        public final void e() {
        }

        IgnoreElementsSubscriber(wrg<? super T> wrg) {
            this.a = wrg;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.b, wrh)) {
                this.b = wrh;
                this.a.a(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void c() {
            this.a.c();
        }

        public final boolean a(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public final void a() {
            this.b.a();
        }
    }

    public FlowableIgnoreElements(Flowable<T> flowable) {
        super(flowable);
    }

    public final void a(wrg<? super T> wrg) {
        this.b.a((FlowableSubscriber<? super T>) new IgnoreElementsSubscriber<Object>(wrg));
    }
}
