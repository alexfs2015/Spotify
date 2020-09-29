package io.reactivex.internal.operators.observable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class ObservableFromPublisher<T> extends Observable<T> {
    private xfk<? extends T> a;

    static final class PublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        private Observer<? super T> a;
        private xfm b;

        PublisherSubscriber(Observer<? super T> observer) {
            this.a = observer;
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
            this.a.onNext(t);
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

    public ObservableFromPublisher(xfk<? extends T> xfk) {
        this.a = xfk;
    }

    public final void a(Observer<? super T> observer) {
        this.a.b(new PublisherSubscriber(observer));
    }
}
