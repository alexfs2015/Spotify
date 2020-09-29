package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class CompletableEmpty extends Completable {
    public static final Completable a = new CompletableEmpty();

    private CompletableEmpty() {
    }

    public final void b(CompletableObserver completableObserver) {
        EmptyDisposable.a(completableObserver);
    }
}
