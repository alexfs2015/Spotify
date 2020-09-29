package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;

public final class FlowableOnErrorReturn<T> extends AbstractFlowableWithUpstream<T, T> {
    private Function<? super Throwable, ? extends T> c;

    static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final Function<? super Throwable, ? extends T> valueSupplier;

        OnErrorReturnSubscriber(wrg<? super T> wrg, Function<? super Throwable, ? extends T> function) {
            super(wrg);
            this.valueSupplier = function;
        }

        public final void b_(T t) {
            this.produced++;
            this.downstream.b_(t);
        }

        public final void onError(Throwable th) {
            try {
                b(ObjectHelper.a(this.valueSupplier.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                Exceptions.b(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        public final void c() {
            this.downstream.c();
        }
    }

    public FlowableOnErrorReturn(Flowable<T> flowable, Function<? super Throwable, ? extends T> function) {
        super(flowable);
        this.c = function;
    }

    public final void a(wrg<? super T> wrg) {
        this.b.a((FlowableSubscriber<? super T>) new OnErrorReturnSubscriber<Object>(wrg, this.c));
    }
}
