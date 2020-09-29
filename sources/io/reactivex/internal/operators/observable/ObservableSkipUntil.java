package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;

public final class ObservableSkipUntil<T, U> extends AbstractObservableWithUpstream<T, T> {
    private ObservableSource<U> b;

    final class SkipUntil implements Observer<U> {
        private ArrayCompositeDisposable a;
        private SkipUntilObserver<T> b;
        private SerializedObserver<T> c;
        private Disposable d;

        SkipUntil(ArrayCompositeDisposable arrayCompositeDisposable, SkipUntilObserver<T> skipUntilObserver, SerializedObserver<T> serializedObserver) {
            this.a = arrayCompositeDisposable;
            this.b = skipUntilObserver;
            this.c = serializedObserver;
        }

        public final void onComplete() {
            this.b.a = true;
        }

        public final void onError(Throwable th) {
            this.a.bd_();
            this.c.onError(th);
        }

        public final void onNext(U u) {
            this.d.bd_();
            this.b.a = true;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.d, disposable)) {
                this.d = disposable;
                this.a.a(1, disposable);
            }
        }
    }

    static final class SkipUntilObserver<T> implements Observer<T> {
        volatile boolean a;
        private Observer<? super T> b;
        private ArrayCompositeDisposable c;
        private Disposable d;
        private boolean e;

        SkipUntilObserver(Observer<? super T> observer, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.b = observer;
            this.c = arrayCompositeDisposable;
        }

        public final void onComplete() {
            this.c.bd_();
            this.b.onComplete();
        }

        public final void onError(Throwable th) {
            this.c.bd_();
            this.b.onError(th);
        }

        public final void onNext(T t) {
            if (this.e) {
                this.b.onNext(t);
                return;
            }
            if (this.a) {
                this.e = true;
                this.b.onNext(t);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.d, disposable)) {
                this.d = disposable;
                this.c.a(0, disposable);
            }
        }
    }

    public ObservableSkipUntil(ObservableSource<T> observableSource, ObservableSource<U> observableSource2) {
        super(observableSource);
        this.b = observableSource2;
    }

    public final void a(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        serializedObserver.onSubscribe(arrayCompositeDisposable);
        SkipUntilObserver skipUntilObserver = new SkipUntilObserver(serializedObserver, arrayCompositeDisposable);
        this.b.subscribe(new SkipUntil(arrayCompositeDisposable, skipUntilObserver, serializedObserver));
        this.a.subscribe(skipUntilObserver);
    }
}
