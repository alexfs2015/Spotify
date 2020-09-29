package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

public final class MaybeToObservable<T> extends Observable<T> {
    private MaybeSource<T> a;

    static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        Disposable upstream;

        MaybeToObservableObserver(Observer<? super T> observer) {
            super(observer);
        }

        public final void bd_() {
            super.bd_();
            this.upstream.bd_();
        }

        public final void c_(T t) {
            b(t);
        }

        public final void onComplete() {
            f();
        }

        public final void onError(Throwable th) {
            a(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public MaybeToObservable(MaybeSource<T> maybeSource) {
        this.a = maybeSource;
    }

    public final void a(Observer<? super T> observer) {
        this.a.a(new MaybeToObservableObserver(observer));
    }
}
