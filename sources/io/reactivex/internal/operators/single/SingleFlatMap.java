package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMap<T, R> extends Single<R> {
    private SingleSource<? extends T> a;
    private Function<? super T, ? extends SingleSource<? extends R>> b;

    static final class SingleFlatMapCallback<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = 3258103020495908596L;
        final SingleObserver<? super R> downstream;
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;

        static final class FlatMapSingleObserver<R> implements SingleObserver<R> {
            private AtomicReference<Disposable> a;
            private SingleObserver<? super R> b;

            FlatMapSingleObserver(AtomicReference<Disposable> atomicReference, SingleObserver<? super R> singleObserver) {
                this.a = atomicReference;
                this.b = singleObserver;
            }

            public final void c_(R r) {
                this.b.c_(r);
            }

            public final void onError(Throwable th) {
                this.b.onError(th);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this.a, disposable);
            }
        }

        SingleFlatMapCallback(SingleObserver<? super R> singleObserver, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.downstream = singleObserver;
            this.mapper = function;
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void bd_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final void c_(T t) {
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.a(this.mapper.apply(t), "The single returned by the mapper is null");
                if (!b()) {
                    singleSource.b(new FlatMapSingleObserver(this, this.downstream));
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.downstream.onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.b(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    public SingleFlatMap(SingleSource<? extends T> singleSource, Function<? super T, ? extends SingleSource<? extends R>> function) {
        this.b = function;
        this.a = singleSource;
    }

    public final void a(SingleObserver<? super R> singleObserver) {
        this.a.b(new SingleFlatMapCallback(singleObserver, this.b));
    }
}
