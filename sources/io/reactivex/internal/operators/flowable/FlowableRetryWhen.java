package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;

public final class FlowableRetryWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    private Function<? super Flowable<Throwable>, ? extends wrf<?>> c;

    static final class RetryWhenSubscriber<T> extends WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        RetryWhenSubscriber(wrg<? super T> wrg, FlowableProcessor<Throwable> flowableProcessor, wrh wrh) {
            super(wrg, flowableProcessor, wrh);
        }

        public final void onError(Throwable th) {
            b(th);
        }

        public final void c() {
            this.receiver.a();
            this.downstream.c();
        }
    }

    public FlowableRetryWhen(Flowable<T> flowable, Function<? super Flowable<Throwable>, ? extends wrf<?>> function) {
        super(flowable);
        this.c = function;
    }

    public final void a(wrg<? super T> wrg) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(wrg);
        FlowableProcessor l = UnicastProcessor.b(8).l();
        try {
            wrf wrf = (wrf) ObjectHelper.a(this.c.apply(l), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.b);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(serializedSubscriber, l, whenReceiver);
            whenReceiver.subscriber = retryWhenSubscriber;
            wrg.a(retryWhenSubscriber);
            wrf.b(whenReceiver);
            whenReceiver.b_(Integer.valueOf(0));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, wrg);
        }
    }
}
