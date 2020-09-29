package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;

public final class CompletableDefer extends Completable {
    private Callable<? extends CompletableSource> a;

    public CompletableDefer(Callable<? extends CompletableSource> callable) {
        this.a = callable;
    }

    public final void b(CompletableObserver completableObserver) {
        try {
            ((CompletableSource) ObjectHelper.a(this.a.call(), "The completableSupplier returned a null CompletableSource")).a(completableObserver);
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.a(th, completableObserver);
        }
    }
}
