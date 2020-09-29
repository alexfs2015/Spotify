package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class EmptyCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7545121636549663526L;

    public final boolean aZ_() {
        return false;
    }

    public final boolean b() {
        return get() == DisposableHelper.DISPOSED;
    }

    public final void bd_() {
        DisposableHelper.a((AtomicReference<Disposable>) this);
    }

    public final void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        RxJavaPlugins.a((Throwable) new OnErrorNotImplementedException(th));
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.b(this, disposable);
    }
}
