package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class SingleError<T> extends Single<T> {
    private Callable<? extends Throwable> a;

    public SingleError(Callable<? extends Throwable> callable) {
        this.a = callable;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        try {
            th = (Throwable) ObjectHelper.a(this.a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            Exceptions.b(th);
        }
        EmptyDisposable.a(th, singleObserver);
    }
}
