package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {
    private Flowable<T> a;
    private T b = null;

    static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        private SingleObserver<? super T> a;
        private T b;
        private wrh c;
        private boolean d;
        private T e;

        SingleElementSubscriber(SingleObserver<? super T> singleObserver, T t) {
            this.a = singleObserver;
            this.b = t;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.c, wrh)) {
                this.c = wrh;
                this.a.onSubscribe(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void b_(T t) {
            if (!this.d) {
                if (this.e != null) {
                    this.d = true;
                    this.c.a();
                    this.c = SubscriptionHelper.CANCELLED;
                    this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.e = t;
            }
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.a(th);
                return;
            }
            this.d = true;
            this.c = SubscriptionHelper.CANCELLED;
            this.a.onError(th);
        }

        public final void c() {
            if (!this.d) {
                this.d = true;
                this.c = SubscriptionHelper.CANCELLED;
                T t = this.e;
                this.e = null;
                if (t == null) {
                    t = this.b;
                }
                if (t != null) {
                    this.a.c_(t);
                } else {
                    this.a.onError(new NoSuchElementException());
                }
            }
        }

        public final void bf_() {
            this.c.a();
            this.c = SubscriptionHelper.CANCELLED;
        }

        public final boolean b() {
            return this.c == SubscriptionHelper.CANCELLED;
        }
    }

    public FlowableSingleSingle(Flowable<T> flowable, T t) {
        this.a = flowable;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.a.a((FlowableSubscriber<? super T>) new SingleElementSubscriber<Object>(singleObserver, this.b));
    }

    public final Flowable<T> be_() {
        return RxJavaPlugins.a((Flowable<T>) new FlowableSingle<T>(this.a, this.b, true));
    }
}
