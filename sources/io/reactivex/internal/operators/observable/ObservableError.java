package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class ObservableError<T> extends Observable<T> {
    private Callable<? extends Throwable> a;

    public ObservableError(Callable<? extends Throwable> callable) {
        this.a = callable;
    }

    public final void a(Observer<? super T> observer) {
        try {
            th = (Throwable) ObjectHelper.a(this.a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            Exceptions.b(th);
        }
        EmptyDisposable.a(th, observer);
    }
}
