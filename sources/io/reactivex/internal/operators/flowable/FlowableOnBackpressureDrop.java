package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

public final class FlowableOnBackpressureDrop<T> extends AbstractFlowableWithUpstream<T, T> implements Consumer<T> {
    private Consumer<? super T> c = this;

    static final class BackpressureDropSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, xfm {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final xfl<? super T> downstream;
        final Consumer<? super T> onDrop;
        xfm upstream;

        BackpressureDropSubscriber(xfl<? super T> xfl, Consumer<? super T> consumer) {
            this.downstream = xfl;
            this.onDrop = consumer;
        }

        public final void a() {
            this.upstream.a();
        }

        public final void a(long j) {
            if (SubscriptionHelper.b(j)) {
                BackpressureHelper.a((AtomicLong) this, j);
            }
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
                if (get() != 0) {
                    this.downstream.b_(t);
                    BackpressureHelper.c(this, 1);
                    return;
                }
                try {
                    this.onDrop.accept(t);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    a();
                    onError(th);
                }
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                this.downstream.c();
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

    public FlowableOnBackpressureDrop(Flowable<T> flowable) {
        super(flowable);
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a((FlowableSubscriber<? super T>) new BackpressureDropSubscriber<Object>(xfl, this.c));
    }

    public final void accept(T t) {
    }
}
