package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;

public final class SingleMap<T, R> extends Single<R> {
    private SingleSource<? extends T> a;
    private Function<? super T, ? extends R> b;

    static final class MapSingleObserver<T, R> implements SingleObserver<T> {
        private SingleObserver<? super R> a;
        private Function<? super T, ? extends R> b;

        MapSingleObserver(SingleObserver<? super R> singleObserver, Function<? super T, ? extends R> function) {
            this.a = singleObserver;
            this.b = function;
        }

        public final void c_(T t) {
            try {
                this.a.c_(ObjectHelper.a(this.b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                Exceptions.b(th);
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }
    }

    public SingleMap(SingleSource<? extends T> singleSource, Function<? super T, ? extends R> function) {
        this.a = singleSource;
        this.b = function;
    }

    public final void a(SingleObserver<? super R> singleObserver) {
        this.a.b(new MapSingleObserver(singleObserver, this.b));
    }
}
