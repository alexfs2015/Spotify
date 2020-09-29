package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class FlowableToList<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {
    private Callable<U> c;

    static final class ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements FlowableSubscriber<T>, wrh {
        private static final long serialVersionUID = -8134157938864266736L;
        wrh upstream;

        ToListSubscriber(wrg<? super U> wrg, U u) {
            super(wrg);
            this.value = u;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.upstream, wrh)) {
                this.upstream = wrh;
                this.downstream.a(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            Collection collection = (Collection) this.value;
            if (collection != null) {
                collection.add(t);
            }
        }

        public final void onError(Throwable th) {
            this.value = null;
            this.downstream.onError(th);
        }

        public final void c() {
            b(this.value);
        }

        public final void a() {
            super.a();
            this.upstream.a();
        }
    }

    public FlowableToList(Flowable<T> flowable, Callable<U> callable) {
        super(flowable);
        this.c = callable;
    }

    public final void a(wrg<? super U> wrg) {
        try {
            this.b.a((FlowableSubscriber<? super T>) new ToListSubscriber<Object>(wrg, (Collection) ObjectHelper.a(this.c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, wrg);
        }
    }
}
