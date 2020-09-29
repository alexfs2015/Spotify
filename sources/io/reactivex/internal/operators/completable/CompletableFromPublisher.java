package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class CompletableFromPublisher<T> extends Completable {
    private xfk<T> a;

    static final class FromPublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        private CompletableObserver a;
        private xfm b;

        FromPublisherSubscriber(CompletableObserver completableObserver) {
            this.a = completableObserver;
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
        }

        public final void bd_() {
            this.b.a();
            this.b = SubscriptionHelper.CANCELLED;
        }

        public final void c() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }
    }

    public CompletableFromPublisher(xfk<T> xfk) {
        this.a = xfk;
    }

    public final void b(CompletableObserver completableObserver) {
        this.a.b(new FromPublisherSubscriber(completableObserver));
    }
}
