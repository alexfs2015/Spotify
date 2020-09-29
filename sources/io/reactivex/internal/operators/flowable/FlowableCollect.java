package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class FlowableCollect<T, U> extends AbstractFlowableWithUpstream<T, U> {
    private Callable<? extends U> c;
    private BiConsumer<? super U, ? super T> d;

    static final class CollectSubscriber<T, U> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        final BiConsumer<? super U, ? super T> collector;
        boolean done;
        final U u;
        xfm upstream;

        CollectSubscriber(xfl<? super U> xfl, U u2, BiConsumer<? super U, ? super T> biConsumer) {
            super(xfl);
            this.collector = biConsumer;
            this.u = u2;
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
                try {
                    this.collector.accept(this.u, t);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.upstream.a();
                    onError(th);
                }
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                b(this.u);
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

    public FlowableCollect(Flowable<T> flowable, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        super(flowable);
        this.c = callable;
        this.d = biConsumer;
    }

    public final void a(xfl<? super U> xfl) {
        try {
            this.b.a((FlowableSubscriber<? super T>) new CollectSubscriber<Object>(xfl, ObjectHelper.a(this.c.call(), "The initial value supplied is null"), this.d));
        } catch (Throwable th) {
            EmptySubscription.a(th, xfl);
        }
    }
}
