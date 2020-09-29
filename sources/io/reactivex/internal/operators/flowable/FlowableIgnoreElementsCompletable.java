package io.reactivex.internal.operators.flowable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class FlowableIgnoreElementsCompletable<T> extends Completable implements FuseToFlowable<T> {
    private Flowable<T> a;

    static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        private CompletableObserver a;
        private wrh b;

        public final void b_(T t) {
        }

        IgnoreElementsSubscriber(CompletableObserver completableObserver) {
            this.a = completableObserver;
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.b, wrh)) {
                this.b = wrh;
                this.a.onSubscribe(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void onError(Throwable th) {
            this.b = SubscriptionHelper.CANCELLED;
            this.a.onError(th);
        }

        public final void c() {
            this.b = SubscriptionHelper.CANCELLED;
            this.a.onComplete();
        }

        public final void bf_() {
            this.b.a();
            this.b = SubscriptionHelper.CANCELLED;
        }

        public final boolean b() {
            return this.b == SubscriptionHelper.CANCELLED;
        }
    }

    public FlowableIgnoreElementsCompletable(Flowable<T> flowable) {
        this.a = flowable;
    }

    public final void b(CompletableObserver completableObserver) {
        this.a.a((FlowableSubscriber<? super T>) new IgnoreElementsSubscriber<Object>(completableObserver));
    }

    public final Flowable<T> be_() {
        return RxJavaPlugins.a((Flowable<T>) new FlowableIgnoreElements<T>(this.a));
    }
}
