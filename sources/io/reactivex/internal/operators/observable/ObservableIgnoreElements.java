package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public final class ObservableIgnoreElements<T> extends AbstractObservableWithUpstream<T, T> {

    static final class IgnoreObservable<T> implements Observer<T>, Disposable {
        private Observer<? super T> a;
        private Disposable b;

        public final void onNext(T t) {
        }

        IgnoreObservable(Observer<? super T> observer) {
            this.a = observer;
        }

        public final void onSubscribe(Disposable disposable) {
            this.b = disposable;
            this.a.onSubscribe(this);
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void bf_() {
            this.b.bf_();
        }

        public final boolean b() {
            return this.b.b();
        }
    }

    public ObservableIgnoreElements(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new IgnoreObservable(observer));
    }
}
