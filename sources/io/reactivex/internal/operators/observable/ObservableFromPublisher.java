package io.reactivex.internal.operators.observable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class ObservableFromPublisher<T> extends Observable<T> {
    private wrf<? extends T> a;

    static final class PublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        private Observer<? super T> a;
        private wrh b;

        PublisherSubscriber(Observer<? super T> observer) {
            this.a = observer;
        }

        public final void c() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void b_(T t) {
            this.a.onNext(t);
        }

        public final void a(wrh wrh) {
            if (SubscriptionHelper.a(this.b, wrh)) {
                this.b = wrh;
                this.a.onSubscribe(this);
                wrh.a(Long.MAX_VALUE);
            }
        }

        public final void bf_() {
            this.b.a();
            this.b = SubscriptionHelper.CANCELLED;
        }

        public final boolean b() {
            return this.b == SubscriptionHelper.CANCELLED;
        }
    }

    public ObservableFromPublisher(wrf<? extends T> wrf) {
        this.a = wrf;
    }

    public final void a(Observer<? super T> observer) {
        this.a.b(new PublisherSubscriber(observer));
    }
}
