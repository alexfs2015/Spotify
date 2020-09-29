package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class ObservableToList<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {
    private Callable<U> b;

    static final class ToListObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        private Observer<? super U> a;
        private Disposable b;
        private U c;

        ToListObserver(Observer<? super U> observer, U u) {
            this.a = observer;
            this.c = u;
        }

        public final boolean b() {
            return this.b.b();
        }

        public final void bd_() {
            this.b.bd_();
        }

        public final void onComplete() {
            U u = this.c;
            this.c = null;
            this.a.onNext(u);
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.c = null;
            this.a.onError(th);
        }

        public final void onNext(T t) {
            this.c.add(t);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableToList(ObservableSource<T> observableSource, Callable<U> callable) {
        super(observableSource);
        this.b = callable;
    }

    public final void a(Observer<? super U> observer) {
        try {
            this.a.subscribe(new ToListObserver(observer, (Collection) ObjectHelper.a(this.b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.a(th, observer);
        }
    }
}
