package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

public final class SingleFromUnsafeSource<T> extends Single<T> {
    private SingleSource<T> a;

    public SingleFromUnsafeSource(SingleSource<T> singleSource) {
        this.a = singleSource;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.a.b(singleObserver);
    }
}
