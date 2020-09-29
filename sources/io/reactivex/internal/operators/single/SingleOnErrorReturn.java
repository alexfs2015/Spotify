package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;

public final class SingleOnErrorReturn<T> extends Single<T> {
    final Function<? super Throwable, ? extends T> a;
    final T b;
    private SingleSource<? extends T> c;

    final class OnErrorReturn implements SingleObserver<T> {
        private final SingleObserver<? super T> a;

        OnErrorReturn(SingleObserver<? super T> singleObserver) {
            this.a = singleObserver;
        }

        public final void c_(T t) {
            this.a.c_(t);
        }

        public final void onError(Throwable th) {
            T t;
            if (SingleOnErrorReturn.this.a != null) {
                try {
                    t = SingleOnErrorReturn.this.a.apply(th);
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    this.a.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                t = SingleOnErrorReturn.this.b;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.a.onError(nullPointerException);
                return;
            }
            this.a.c_(t);
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }
    }

    public SingleOnErrorReturn(SingleSource<? extends T> singleSource, Function<? super Throwable, ? extends T> function, T t) {
        this.c = singleSource;
        this.a = function;
        this.b = t;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.c.b(new OnErrorReturn(singleObserver));
    }
}
