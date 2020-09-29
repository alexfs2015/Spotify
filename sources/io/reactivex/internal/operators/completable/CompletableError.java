package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class CompletableError extends Completable {
    private Throwable a;

    public CompletableError(Throwable th) {
        this.a = th;
    }

    public final void b(CompletableObserver completableObserver) {
        EmptyDisposable.a(this.a, completableObserver);
    }
}
