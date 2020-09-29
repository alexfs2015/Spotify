package io.reactivex.internal.operators.single;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

public final class SingleToObservable<T> extends Observable<T> {
    private SingleSource<? extends T> a;

    static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements SingleObserver<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        Disposable upstream;

        SingleToObservableObserver(Observer<? super T> observer) {
            super(observer);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void c_(T t) {
            b(t);
        }

        public final void onError(Throwable th) {
            a(th);
        }

        public final void bf_() {
            super.bf_();
            this.upstream.bf_();
        }
    }

    public SingleToObservable(SingleSource<? extends T> singleSource) {
        this.a = singleSource;
    }

    public final void a(Observer<? super T> observer) {
        this.a.b(b(observer));
    }

    public static <T> SingleObserver<T> b(Observer<? super T> observer) {
        return new SingleToObservableObserver(observer);
    }
}
