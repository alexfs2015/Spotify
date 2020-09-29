package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DisposableObserver<T> implements Observer<T>, Disposable {
    private AtomicReference<Disposable> a = new AtomicReference<>();

    public final void onSubscribe(Disposable disposable) {
        EndConsumerHelper.a(this.a, disposable, getClass());
    }

    public final boolean b() {
        return this.a.get() == DisposableHelper.DISPOSED;
    }

    public final void bf_() {
        DisposableHelper.a(this.a);
    }
}
