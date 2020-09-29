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

        DistinctSubscriber(wrg<? super T> wrg, Function<? super T, K> function, Collection<? super K> collection) {
            super(wrg);
            this.g = function;
            this.f = collection;
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

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.a(th);
                return;
            }
            this.d = true;
            this.f.clear();
            this.a.onError(th);
        }

        public final void c() {
            if (!this.d) {
                this.d = true;
                this.f.clear();
                this.a.c();
            }
        }

        public final int a(int i) {
            return b(i);
        }

        public final T bc_() {
            T bc_;
            while (true) {
                bc_ = this.c.bc_();
                if (bc_ == null || this.f.add(ObjectHelper.a(this.g.apply(bc_), "The keySelector returned a null key"))) {
                    return bc_;
                }
                if (this.e == 2) {
                    this.b.a(1);
                }
            }
            return bc_;
        }

        public final void e() {
            this.f.clear();
            super.e();
        }
    }

    public FlowableDistinct(Flowable<T> flowable, Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        super(flowable);
        this.c = function;
        this.d = callable;
    }

    public final void a(wrg<? super T> wrg) {
        try {
            this.b.a((FlowableSubscriber<? super T>) new DistinctSubscriber<Object>(wrg, this.c, (Collection) ObjectHelper.a(this.d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, wrg);
        }
    }
}
