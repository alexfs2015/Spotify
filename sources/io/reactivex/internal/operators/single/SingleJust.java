package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposables;

public final class SingleJust<T> extends Single<T> {
    private T a;

    public SingleJust(T t) {
        this.a = t;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        singleObserver.onSubscribe(Disposables.b());
        singleObserver.c_(this.a);
    }
}
