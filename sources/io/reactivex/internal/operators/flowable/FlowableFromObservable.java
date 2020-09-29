package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public final class FlowableFromObservable<T> extends Flowable<T> {
    private final Observable<T> b;

    static final class SubscriberObserver<T> implements Observer<T>, xfm {
        private xfl<? super T> a;
        private Disposable b;

        SubscriberObserver(xfl<? super T> xfl) {
            this.a = xfl;
        }

        public final void a() {
            this.b.bd_();
        }

        public final void a(long j) {
        }

        public final void onComplete() {
            this.a.c();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(T t) {
            this.a.b_(t);
        }

        public final void onSubscribe(Disposable disposable) {
            this.b = disposable;
            this.a.a(this);
        }
    }

    public FlowableFromObservable(Observable<T> observable) {
        this.b = observable;
    }

    public final void a(xfl<? super T> xfl) {
        this.b.subscribe(new SubscriberObserver(xfl));
    }
}
