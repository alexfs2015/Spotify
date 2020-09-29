package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeFlatMapObservable<T, R> extends Observable<R> {
    private MaybeSource<T> a;
    private Function<? super T, ? extends ObservableSource<? extends R>> b;

    static final class FlatMapObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Observer<R>, Disposable {
        private static final long serialVersionUID = -8948264376121066672L;
        final Observer<? super R> downstream;
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;

        FlatMapObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.downstream = observer;
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
                ((ObservableSource) ObjectHelper.a(this.mapper.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.downstream.onError(th);
            }
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this, disposable);
        }
    }

    public MaybeFlatMapObservable(MaybeSource<T> maybeSource, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        this.a = maybeSource;
        this.b = function;
    }

    public final void a(Observer<? super R> observer) {
        FlatMapObserver flatMapObserver = new FlatMapObserver(observer, this.b);
        observer.onSubscribe(flatMapObserver);
        this.a.a(flatMapObserver);
    }
}
