package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;

public final class SingleDoOnSuccess<T> extends Single<T> {
    final Consumer<? super T> a;
    private SingleSource<T> b;

    final class DoOnSuccess implements SingleObserver<T> {
        private SingleObserver<? super T> a;

        DoOnSuccess(SingleObserver<? super T> singleObserver) {
            this.a = singleObserver;
        }

        public final void c_(T t) {
            try {
                SingleDoOnSuccess.this.a.accept(t);
                this.a.c_(t);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.a.onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }
    }

    public SingleDoOnSuccess(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.b = singleSource;
        this.a = consumer;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.b.b(new DoOnSuccess(singleObserver));
    }
}
