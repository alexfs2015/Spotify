package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class FlowableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToFlowable<U> {
    private Flowable<T> a;
    private Callable<U> b;

    static final class ToListSubscriber<T, U extends Collection<? super T>> implements FlowableSubscriber<T>, Disposable {
        private SingleObserver<? super U> a;
        private xfm b;
        private U c;

        ToListSubscriber(SingleObserver<? super U> singleObserver, U u) {
            this.a = singleObserver;
            this.c = u;
        }

        public final void a(xfm xfm) {
            if (SubscriptionHelper.a(this.b, xfm)) {
                this.b = xfm;
                this.a.onSubscribe(this);
                xfm.a(Long.MAX_VALUE);
            }
        }

        public final boolean b() {
            return this.b == SubscriptionHelper.CANCELLED;
        }

        public final void b_(T t) {
            this.c.add(t);
        }

        public final void bd_() {
            this.b.a();
            this.b = SubscriptionHelper.CANCELLED;
        }

        public final void c() {
            this.b = SubscriptionHelper.CANCELLED;
            this.a.c_(this.c);
        }

        public final void onError(Throwable th) {
            this.c = null;
            this.b = SubscriptionHelper.CANCELLED;
            this.a.onError(th);
        }
    }

    public FlowableToListSingle(Flowable<T> flowable, Callable<U> callable) {
        this.a = flowable;
        this.b = callable;
    }

    public final void a(SingleObserver<? super U> singleObserver) {
        try {
            this.a.a((FlowableSubscriber<? super T>) new ToListSubscriber<Object>(singleObserver, (Collection) ObjectHelper.a(this.b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.a(th, singleObserver);
        }
    }

    public final Flowable<U> bc_() {
        return RxJavaPlugins.a((Flowable<T>) new FlowableToList<T>(this.a, this.b));
    }
}
