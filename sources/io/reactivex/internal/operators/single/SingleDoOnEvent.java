package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;

public final class SingleDoOnEvent<T> extends Single<T> {
    final BiConsumer<? super T, ? super Throwable> a;
    private SingleSource<T> b;

    final class DoOnEvent implements SingleObserver<T> {
        private final SingleObserver<? super T> a;

        DoOnEvent(SingleObserver<? super T> singleObserver) {
            this.a = singleObserver;
        }

        public final void c_(T t) {
            try {
                SingleDoOnEvent.this.a.accept(t, null);
                this.a.c_(t);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.a.onError(th);
            }
        }

        public final void onError(Throwable th) {
            try {
                SingleDoOnEvent.this.a.accept(null, th);
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

    public SingleDoOnEvent(SingleSource<T> singleSource, BiConsumer<? super T, ? super Throwable> biConsumer) {
        this.b = singleSource;
        this.a = biConsumer;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.b.b(new DoOnEvent(singleObserver));
    }
}
