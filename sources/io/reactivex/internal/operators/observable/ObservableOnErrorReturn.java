package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableOnErrorReturn<T> extends AbstractObservableWithUpstream<T, T> {
    private Function<? super Throwable, ? extends T> b;

    static final class OnErrorReturnObserver<T> implements Observer<T>, Disposable {
        private Observer<? super T> a;
        private Function<? super Throwable, ? extends T> b;
        private Disposable c;

        OnErrorReturnObserver(Observer<? super T> observer, Function<? super Throwable, ? extends T> function) {
            this.a = observer;
            this.b = function;
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
            try {
                Object apply = this.b.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.a.onError(nullPointerException);
                    return;
                }
                this.a.onNext(apply);
                this.a.onComplete();
            } catch (Throwable th2) {
                Exceptions.b(th2);
                this.a.onError(new CompositeException(th, th2));
            }
        }

        public final void onNext(T t) {
            this.a.onNext(t);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableOnErrorReturn(ObservableSource<T> observableSource, Function<? super Throwable, ? extends T> function) {
        super(observableSource);
        this.b = function;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new OnErrorReturnObserver(observer, this.b));
    }
}
