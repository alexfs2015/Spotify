package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.Callable;

public final class CompletableToSingle<T> extends Single<T> {
    final Callable<? extends T> a = null;
    final T b;
    private CompletableSource c;

    final class ToSingle implements CompletableObserver {
        private final SingleObserver<? super T> a;

        ToSingle(SingleObserver<? super T> singleObserver) {
            this.a = singleObserver;
        }

        public final void onComplete() {
            T t;
            if (CompletableToSingle.this.a != null) {
                try {
                    t = CompletableToSingle.this.a.call();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.a.onError(th);
                    return;
                }
            } else {
                t = CompletableToSingle.this.b;
            }
            if (t == null) {
                this.a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.a.c_(t);
            }
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }
    }

    public CompletableToSingle(CompletableSource completableSource, Callable<? extends T> callable, T t) {
        this.c = completableSource;
        this.b = t;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.c.a(new ToSingle(singleObserver));
    }
}
