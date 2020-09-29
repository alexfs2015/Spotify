package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    private Function<? super Flowable<Object>, ? extends wrf<?>> c;

    static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        RepeatWhenSubscriber(wrg<? super T> wrg, FlowableProcessor<Object> flowableProcessor, wrh wrh) {
            super(wrg, flowableProcessor, wrh);
        }

        public final void onError(Throwable th) {
            this.receiver.a();
            this.downstream.onError(th);
        }

        public final void c() {
            b(Integer.valueOf(0));
        }
    }

    static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, wrh {
        private static final long serialVersionUID = 2827772011130406689L;
        final AtomicLong requested = new AtomicLong();
        final wrf<T> source;
        WhenSourceSubscriber<T, U> subscriber;
        final AtomicReference<wrh> upstream = new AtomicReference<>();

        WhenReceiver(wrf<T> wrf) {
            this.source = wrf;
        }

        public final void a(wrh wrh) {
            SubscriptionHelper.a(this.upstream, this.requested, wrh);
        }

        public final void b_(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.source.b(this.subscriber);
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            this.subscriber.a();
            this.subscriber.downstream.onError(th);
        }

        public final void c() {
            this.subscriber.a();
            this.subscriber.downstream.c();
        }

        public final void a(long j) {
            SubscriptionHelper.a(this.upstream, this.requested, j);
        }

        public final void a() {
            SubscriptionHelper.a(this.upstream);
        }
    }

    static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final wrg<? super T> downstream;
        protected final FlowableProcessor<U> processor;
        private long produced;
        protected final wrh receiver;

        WhenSourceSubscriber(wrg<? super T> wrg, FlowableProcessor<U> flowableProcessor, wrh wrh) {
            super(false);
            this.downstream = wrg;
            this.processor = flowableProcessor;
            this.receiver = wrh;
        }

        public final void a(wrh wrh) {
            b(wrh);
        }

        public final void b_(T t) {
            this.produced++;
            this.downstream.b_(t);
        }

        /* access modifiers changed from: protected */
        public final void b(U u) {
            b(EmptySubscription.INSTANCE);
            long j = this.produced;
            if (j != 0) {
                this.produced = 0;
                d(j);
            }
            this.receiver.a(1);
            this.processor.b_(u);
        }

        public final void a() {
            super.a();
            this.receiver.a();
        }
    }

    public final void a(wrg<? super T> wrg) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(wrg);
        FlowableProcessor l = UnicastProcessor.b(8).l();
        try {
            wrf wrf = (wrf) ObjectHelper.a(this.c.apply(l), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.b);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, l, whenReceiver);
            whenReceiver.subscriber = repeatWhenSubscriber;
            wrg.a(repeatWhenSubscriber);
            wrf.b(whenReceiver);
            whenReceiver.b_(Integer.valueOf(0));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, wrg);
        }
    }
}
