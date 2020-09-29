package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class FlowableDistinct<T, K> extends AbstractFlowableWithUpstream<T, T> {
    private Function<? super T, K> c;
    private Callable<? extends Collection<? super K>> d;

    static final class DistinctSubscriber<T, K> extends BasicFuseableSubscriber<T, T> {
        private Collection<? super K> f;
        private Function<? super T, K> g;

        DistinctSubscriber(xfl<? super T> xfl, Function<? super T, K> function, Collection<? super K> collection) {
            super(xfl);
            this.g = function;
            this.f = collection;
        }

        public final int a(int i) {
            return b(i);
        }

        public final void b_(T t) {
            if (!this.d) {
                if (this.e == 0) {
                    try {
                        if (this.f.add(ObjectHelper.a(this.g.apply(t), "The keySelector returned a null key"))) {
                            this.a.b_(t);
                        } else {
                            this.b.a(1);
                        }
                    } catch (Throwable th) {
                        a(th);
                    }
                } else {
                    this.a.b_(null);
                }
            }
        }

        public final T ba_() {
            T ba_;
            while (true) {
                ba_ = this.c.ba_();
                if (ba_ == null || this.f.add(ObjectHelper.a(this.g.apply(ba_), "The keySelector returned a null key"))) {
                    return ba_;
                }
                if (this.e == 2) {
                    this.b.a(1);
                }
            }
            return ba_;
        }

        public final void c() {
            if (!this.d) {
                this.d = true;
                this.f.clear();
                this.a.c();
            }
        }

        public final void e() {
            this.f.clear();
            super.e();
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.a(th);
                return;
            }
            this.d = true;
            this.f.clear();
            this.a.onError(th);
        }
    }

    public FlowableDistinct(Flowable<T> flowable, Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        super(flowable);
        this.c = function;
        this.d = callable;
    }

    public final void a(xfl<? super T> xfl) {
        try {
            this.b.a((FlowableSubscriber<? super T>) new DistinctSubscriber<Object>(xfl, this.c, (Collection) ObjectHelper.a(this.d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, xfl);
        }
    }
}
