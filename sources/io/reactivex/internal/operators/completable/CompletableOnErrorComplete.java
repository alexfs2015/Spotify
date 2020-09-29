package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;

public final class CompletableOnErrorComplete extends Completable {
    final Predicate<? super Throwable> a;
    private CompletableSource b;

    final class OnError implements CompletableObserver {
        private final CompletableObserver a;

        OnError(CompletableObserver completableObserver) {
            this.a = completableObserver;
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            try {
                if (CompletableOnErrorComplete.this.a.test(th)) {
                    this.a.onComplete();
                } else {
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.b(th2);
                this.a.onError(new CompositeException(th, th2));
            }
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }
    }

    public CompletableOnErrorComplete(CompletableSource completableSource, Predicate<? super Throwable> predicate) {
        this.b = completableSource;
        this.a = predicate;
    }

    public final void b(CompletableObserver completableObserver) {
        this.b.a(new OnError(completableObserver));
    }
}
