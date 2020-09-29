package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class CompletableFromPublisher<T> extends Completable {
    private wrf<T> a;

    static final class FromPublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        private CompletableObserver a;
        private wrh b;

        public final void b_(T t) {
        }

        FromPublisherSubscriber(CompletableObserver completableObserver) {
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
            this.a.onError(th);
        }

        public final void c() {
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

    public CompletableFromPublisher(wrf<T> wrf) {
        this.a = wrf;
    }

    public final void b(CompletableObserver completableObserver) {
        this.a.b(new FromPublisherSubscriber(completableObserver));
    }
}
