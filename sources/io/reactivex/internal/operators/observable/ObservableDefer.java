package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class ObservableDefer<T> extends Observable<T> {
    private Callable<? extends ObservableSource<? extends T>> a;

    public ObservableDefer(Callable<? extends ObservableSource<? extends T>> callable) {
        this.a = callable;
    }

    public final void a(Observer<? super T> observer) {
        try {
            ((ObservableSource) ObjectHelper.a(this.a.call(), "null ObservableSource supplied")).subscribe(observer);
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.a(th, observer);
        }
    }
}
