package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class ObservableFromCallable<T> extends Observable<T> implements Callable<T> {
    private Callable<? extends T> a;

    public ObservableFromCallable(Callable<? extends T> callable) {
        this.a = callable;
    }

    public final void a(Observer<? super T> observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (!deferredScalarDisposable.b()) {
            try {
                deferredScalarDisposable.b(ObjectHelper.a(this.a.call(), "Callable returned null"));
            } catch (Throwable th) {
                Exceptions.b(th);
                if (!deferredScalarDisposable.b()) {
                    observer.onError(th);
                } else {
                    RxJavaPlugins.a(th);
                }
            }
        }
    }

    public final T call() {
        return ObjectHelper.a(this.a.call(), "The callable returned a null value");
    }
}
