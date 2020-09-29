package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

public final class CompletableFromRunnable extends Completable {
    private Runnable a;

    public CompletableFromRunnable(Runnable runnable) {
        this.a = runnable;
    }

    public final void b(CompletableObserver completableObserver) {
        Disposable a2 = Disposables.a();
        completableObserver.onSubscribe(a2);
        try {
            this.a.run();
            if (!a2.b()) {
                completableObserver.onComplete();
            }
        } catch (Throwable th) {
            Exceptions.b(th);
            if (!a2.b()) {
                completableObserver.onError(th);
            } else {
                RxJavaPlugins.a(th);
            }
        }
    }
}
