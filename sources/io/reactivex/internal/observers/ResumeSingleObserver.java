package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class ResumeSingleObserver<T> implements SingleObserver<T> {
    private AtomicReference<Disposable> a;
    private SingleObserver<? super T> b;

    public ResumeSingleObserver(AtomicReference<Disposable> atomicReference, SingleObserver<? super T> singleObserver) {
        this.a = atomicReference;
        this.b = singleObserver;
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.c(this.a, disposable);
    }

    public final void c_(T t) {
        this.b.c_(t);
    }

    public final void onError(Throwable th) {
        this.b.onError(th);
    }
}
