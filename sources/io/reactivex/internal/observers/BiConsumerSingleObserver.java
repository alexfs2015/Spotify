package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class BiConsumerSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
    private static final long serialVersionUID = 4943102778943297569L;
    final BiConsumer<? super T, ? super Throwable> onCallback;

    public BiConsumerSingleObserver(BiConsumer<? super T, ? super Throwable> biConsumer) {
        this.onCallback = biConsumer;
    }

    public final boolean b() {
        return get() == DisposableHelper.DISPOSED;
    }

    public final void bd_() {
        DisposableHelper.a((AtomicReference<Disposable>) this);
    }

    public final void c_(T t) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.accept(t, null);
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.a(th);
        }
    }

    public final void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.onCallback.accept(null, th);
        } catch (Throwable th2) {
            Exceptions.b(th2);
            RxJavaPlugins.a((Throwable) new CompositeException(th, th2));
        }
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.b(this, disposable);
    }
}
