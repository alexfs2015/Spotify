package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableSkip<T> extends AbstractObservableWithUpstream<T, T> {
    private long b;

    static final class SkipObserver<T> implements Observer<T>, Disposable {
        private Observer<? super T> a;
        private long b;
        private Disposable c;

        SkipObserver(Observer<? super T> observer, long j) {
            this.a = observer;
            this.b = j;
        }

        public final boolean b() {
            return this.c.b();
        }

        public final void bd_() {
            this.c.bd_();
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(T t) {
            long j = this.b;
            if (j != 0) {
                this.b = j - 1;
            } else {
                this.a.onNext(t);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSkip(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.b = j;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new SkipObserver(observer, this.b));
    }
}
