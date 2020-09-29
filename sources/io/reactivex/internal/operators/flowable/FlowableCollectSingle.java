package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class FlowableCollectSingle<T, U> extends Single<U> implements FuseToFlowable<U> {
    private Flowable<T> a;
    private Callable<? extends U> b;
    private BiConsumer<? super U, ? super T> c;

    static final class CollectSubscriber<T, U> implements FlowableSubscriber<T>, Disposable {
        private SingleObserver<? super U> a;
        private BiConsumer<? super U, ? super T> b;
        private U c;
        private xfm d;
        private boolean e;

        CollectSubscriber(SingleObserver<? super U> singleObserver, U u, BiConsumer<? super U, ? super T> biConsumer) {
            this.a = singleObserver;
            this.b = biConsumer;
            this.c = u;
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.d, xfm)) {
                this.d = xfm;
                this.a.onSubscribe(this);
                xfm.a(Long.MAX_VALUE);
            }
        }

        public final boolean b() {
            return this.d == SubscriptionHelper.CANCELLED;
        }

        public final void b_(T t) {
            if (!this.e) {
                try {
                    this.b.accept(this.c, t);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.d.a();
                    onError(th);
                }
            }
        }

        public final void bd_() {
            this.d.a();
            this.d = SubscriptionHelper.CANCELLED;
        }

        public final void c() {
            if (!this.e) {
                this.e = true;
                this.d = SubscriptionHelper.CANCELLED;
                this.a.c_(this.c);
            }
        }

        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.a(th);
                return;
            }
            this.e = true;
            this.d = SubscriptionHelper.CANCELLED;
            this.a.onError(th);
        }
    }

    public FlowableCollectSingle(Flowable<T> flowable, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        this.a = flowable;
        this.b = callable;
        this.c = biConsumer;
    }

    public final void a(SingleObserver<? super U> singleObserver) {
        try {
            this.a.a((FlowableSubscriber<? super T>) new CollectSubscriber<Object>(singleObserver, ObjectHelper.a(this.b.call(), "The initialSupplier returned a null value"), this.c));
        } catch (Throwable th) {
            EmptyDisposable.a(th, singleObserver);
        }
    }

    public final Flowable<U> bc_() {
        return RxJavaPlugins.a((Flowable<T>) new FlowableCollect<T>(this.a, this.b, this.c));
    }
}
