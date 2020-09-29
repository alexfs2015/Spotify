package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;

public final class CompletableFromSingle<T> extends Completable {
    private SingleSource<T> a;

    static final class CompletableFromSingleObserver<T> implements SingleObserver<T> {
        private CompletableObserver a;

        CompletableFromSingleObserver(CompletableObserver completableObserver) {
            this.a = completableObserver;
        }

        public final void c_(T t) {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            this.a.onSubscribe(disposable);
        }
    }

    public CompletableFromSingle(SingleSource<T> singleSource) {
        this.a = singleSource;
    }

    public final void b(CompletableObserver completableObserver) {
        this.a.b(new CompletableFromSingleObserver(completableObserver));
    }
}
