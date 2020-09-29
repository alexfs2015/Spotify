package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {
    private final Consumer<? super xfm> c;
    private final LongConsumer d;
    private final Action e;

    static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, xfm {
        private xfl<? super T> a;
        private Consumer<? super xfm> b;
        private LongConsumer c;
        private Action d;
        private xfm e;

        SubscriptionLambdaSubscriber(xfl<? super T> xfl, Consumer<? super xfm> consumer, LongConsumer longConsumer, Action action) {
            this.a = xfl;
            this.b = consumer;
            this.d = action;
            this.c = longConsumer;
        }

        public final void a() {
            xfm xfm = this.e;
            if (xfm != SubscriptionHelper.CANCELLED) {
                this.e = SubscriptionHelper.CANCELLED;
                try {
                    this.d.run();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.a(th);
                }
                xfm.a();
            }
        }

        public final void a(long j) {
            this.e.a(j);
        }

        public final void a(xfm xfm) {
            try {
                this.b.accept(xfm);
                if (SubscriptionHelper.a(this.e, xfm)) {
                    this.e = xfm;
                    this.a.a(this);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                xfm.a();
                this.e = SubscriptionHelper.CANCELLED;
                EmptySubscription.a(th, this.a);
            }
        }

        public final void b_(T t) {
            this.a.b_(t);
        }

        public final void c() {
            if (this.e != SubscriptionHelper.CANCELLED) {
                this.a.c();
            }
        }

        public final void onError(Throwable th) {
            if (this.e != SubscriptionHelper.CANCELLED) {
                this.a.onError(th);
            } else {
                RxJavaPlugins.a(th);
            }
        }
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super xfm> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.c = consumer;
        this.d = longConsumer;
        this.e = action;
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a((FlowableSubscriber<? super T>) new SubscriptionLambdaSubscriber<Object>(xfl, this.c, this.d, this.e));
    }
}
