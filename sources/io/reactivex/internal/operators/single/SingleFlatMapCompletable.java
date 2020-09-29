package io.reactivex.internal.operators.single;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class SingleFlatMapCompletable<T> extends Completable {
    private SingleSource<T> a;
    private Function<? super T, ? extends CompletableSource> b;

    static final class FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, SingleObserver<T>, Disposable {
        private static final long serialVersionUID = -2177128922851101253L;
        final CompletableObserver downstream;
        final Function<? super T, ? extends CompletableSource> mapper;

        FlatMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function) {
            this.downstream = completableObserver;
            this.mapper = function;
        }

        public final void bf_() {
            DisposableHelper.a((AtomicReference<Disposable>) this);
        }

        public final boolean b() {
            return DisposableHelper.a((Disposable) get());
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this, disposable);
        }

        public final void c_(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.a(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                if (!b()) {
                    completableSource.a(this);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }
    }

    public SingleFlatMapCompletable(SingleSource<T> singleSource, Function<? super T, ? extends CompletableSource> function) {
        this.a = singleSource;
        this.b = function;
    }

    public final void b(CompletableObserver completableObserver) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(completableObserver, this.b);
        completableObserver.onSubscribe(flatMapCompletableObserver);
        this.a.b(flatMapCompletableObserver);
    }
}
