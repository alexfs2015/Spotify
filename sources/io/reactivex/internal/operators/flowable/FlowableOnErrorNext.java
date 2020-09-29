package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {
    private Function<? super Throwable, ? extends xfk<? extends T>> c;
    private boolean d = false;

    static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4063763155303814625L;
        final boolean allowFatal;
        boolean done;
        final xfl<? super T> downstream;
        final Function<? super Throwable, ? extends xfk<? extends T>> nextSupplier;
        boolean once;
        long produced;

        OnErrorNextSubscriber(xfl<? super T> xfl, Function<? super Throwable, ? extends xfk<? extends T>> function, boolean z) {
            super(false);
            this.downstream = xfl;
            this.nextSupplier = function;
            this.allowFatal = z;
        }

        public final void a(xfm xfm) {
            b(xfm);
        }

        public final void b_(T t) {
            if (!this.done) {
                if (!this.once) {
                    this.produced++;
                }
                this.downstream.b_(t);
            }
        }

        public final void c() {
            if (!this.done) {
                this.done = true;
                this.once = true;
                this.downstream.c();
            }
        }

        public final void onError(Throwable th) {
            if (!this.once) {
                this.once = true;
                if (!this.allowFatal || (th instanceof Exception)) {
                    try {
                        xfk xfk = (xfk) ObjectHelper.a(this.nextSupplier.apply(th), "The nextSupplier returned a null Publisher");
                        long j = this.produced;
                        if (j != 0) {
                            d(j);
                        }
                        xfk.b(this);
                    } catch (Throwable th2) {
                        Exceptions.b(th2);
                        this.downstream.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.downstream.onError(th);
                }
            } else if (this.done) {
                RxJavaPlugins.a(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }

    public FlowableOnErrorNext(Flowable<T> flowable, Function<? super Throwable, ? extends xfk<? extends T>> function, boolean z) {
        super(flowable);
        this.c = function;
    }

    public final void a(xfl<? super T> xfl) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(xfl, this.c, this.d);
        xfl.a(onErrorNextSubscriber);
        this.b.a((FlowableSubscriber<? super T>) onErrorNextSubscriber);
    }
}
