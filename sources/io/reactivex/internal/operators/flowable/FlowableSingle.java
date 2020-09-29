package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class FlowableSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    private T c;
    private boolean d = true;

    static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        final T defaultValue;
        boolean done;
        final boolean failOnEmpty;
        xfm upstream;

        SingleElementSubscriber(xfl<? super T> xfl, T t, boolean z) {
            super(xfl);
            this.defaultValue = t;
            this.failOnEmpty = z;
        }

        public final void a() {
            super.a();
            this.upstream.a();
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
                if (this.value != null) {
                    this.done = true;
                    this.upstream.a();
                    this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.value = t;
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                T t = this.value;
                this.value = null;
                if (t == null) {
                    t = this.defaultValue;
                }
                if (t != null) {
                    b(t);
                } else if (this.failOnEmpty) {
                    this.downstream.onError(new NoSuchElementException());
                } else {
                    this.downstream.c();
                }
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

    public FlowableSingle(Flowable<T> flowable, T t, boolean z) {
        super(flowable);
        this.c = t;
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a((FlowableSubscriber<? super T>) new SingleElementSubscriber<Object>(xfl, this.c, this.d));
    }
}
