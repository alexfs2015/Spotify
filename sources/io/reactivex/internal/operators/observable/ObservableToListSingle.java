package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class ObservableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToObservable<U> {
    private ObservableSource<T> a;
    private Callable<U> b;

    static final class ToListObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        private SingleObserver<? super U> a;
        private U b;
        private Disposable c;

        ToListObserver(SingleObserver<? super U> singleObserver, U u) {
            this.a = singleObserver;
            this.b = u;
        }

        public final boolean b() {
            return this.c.b();
        }

        public final void bd_() {
            this.c.bd_();
        }

        public final void onComplete() {
            U u = this.b;
            this.b = null;
            this.a.c_(u);
        }

        public final void onError(Throwable th) {
            this.b = null;
            this.a.onError(th);
        }

        public final void onNext(T t) {
            this.b.add(t);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, int i) {
        this.a = observableSource;
        this.b = Functions.a(i);
    }

    public final void a(SingleObserver<? super U> singleObserver) {
        try {
            this.a.subscribe(new ToListObserver(singleObserver, (Collection) ObjectHelper.a(this.b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.a(th, singleObserver);
        }
    }

    public final Observable<U> be_() {
        return RxJavaPlugins.a((Observable<T>) new ObservableToList<T>(this.a, this.b));
    }
}
