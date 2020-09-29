package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;

public final class SingleDoOnError<T> extends Single<T> {
    final Consumer<? super Throwable> a;
    private SingleSource<T> b;

    final class DoOnError implements SingleObserver<T> {
        private final SingleObserver<? super T> a;

        DoOnError(SingleObserver<? super T> singleObserver) {
            this.a = singleObserver;
        }

        public final void c_(T t) {
            this.a.c_(t);
        }

        public final void onError(Throwable th) {
            try {
                SingleDoOnError.this.a.accept(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }
    }

    public SingleDoOnError(SingleSource<T> singleSource, Consumer<? super Throwable> consumer) {
        this.b = singleSource;
        this.a = consumer;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.b.b(new DoOnError(singleObserver));
    }
}
