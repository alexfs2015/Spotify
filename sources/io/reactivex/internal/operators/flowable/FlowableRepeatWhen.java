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
    private Function<? super Flowable<Object>, ? extends xfk<?>> c;

    static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        RepeatWhenSubscriber(xfl<? super T> xfl, FlowableProcessor<Object> flowableProcessor, xfm xfm) {
            super(xfl, flowableProcessor, xfm);
        }

        public final void c() {
            b(Integer.valueOf(0));
        }

        public final void onError(Throwable th) {
            this.receiver.a();
            this.downstream.onError(th);
        }
    }

    static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, xfm {
        private static final long serialVersionUID = 2827772011130406689L;
        final AtomicLong requested = new AtomicLong();
        final xfk<T> source;
        WhenSourceSubscriber<T, U> subscriber;
        final AtomicReference<xfm> upstream = new AtomicReference<>();

        WhenReceiver(xfk<T> xfk) {
            this.source = xfk;
        }

        public final void a() {
            SubscriptionHelper.a(this.upstream);
        }

        public final void a(long j) {
            SubscriptionHelper.a(this.upstream, this.requested, j);
        }

        public final void a(xfm xfm) {
            SubscriptionHelper.a(this.upstream, this.requested, xfm);
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

        public final void c() {
            this.subscriber.a();
            this.subscriber.downstream.c();
        }

        public final void onError(Throwable th) {
            this.subscriber.a();
            this.subscriber.downstream.onError(th);
        }
    }

    static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final xfl<? super T> downstream;
        protected final FlowableProcessor<U> processor;
        private long produced;
        protected final xfm receiver;

        WhenSourceSubscriber(xfl<? super T> xfl, FlowableProcessor<U> flowableProcessor, xfm xfm) {
            super(false);
            this.downstream = xfl;
            this.processor = flowableProcessor;
            this.receiver = xfm;
        }

        public final void a() {
            super.a();
            this.receiver.a();
        }

        public final void a(xfm xfm) {
            b(xfm);
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

        public final void b_(T t) {
            this.produced++;
            this.downstream.b_(t);
        }
    }

    public final void a(xfl<? super T> xfl) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(xfl);
        FlowableProcessor l = UnicastProcessor.b(8).l();
        try {
            xfk xfk = (xfk) ObjectHelper.a(this.c.apply(l), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.b);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, l, whenReceiver);
            whenReceiver.subscriber = repeatWhenSubscriber;
            xfl.a(repeatWhenSubscriber);
            xfk.b(whenReceiver);
            whenReceiver.b_(Integer.valueOf(0));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, xfl);
        }
    }
}
