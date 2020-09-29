package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableHide<T> extends AbstractObservableWithUpstream<T, T> {

    static final class HideDisposable<T> implements Observer<T>, Disposable {
        private Observer<? super T> a;
        private Disposable b;

        HideDisposable(Observer<? super T> observer) {
            this.a = observer;
        }

        public final boolean b() {
            return this.b.b();
        }

        public final void bd_() {
            this.b.bd_();
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(T t) {
            this.a.onNext(t);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableHide(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new HideDisposable(observer));
    }
}
