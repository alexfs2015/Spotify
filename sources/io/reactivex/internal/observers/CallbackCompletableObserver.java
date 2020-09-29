package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class CallbackCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Consumer<Throwable>, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -4361286194466301354L;
    final Action onComplete;
    final Consumer<? super Throwable> onError;

    public final /* synthetic */ void accept(Object obj) {
        RxJavaPlugins.a((Throwable) new OnErrorNotImplementedException((Throwable) obj));
    }

    public CallbackCompletableObserver(Action action) {
        this.onError = this;
        this.onComplete = action;
    }

    public CallbackCompletableObserver(Consumer<? super Throwable> consumer, Action action) {
        this.onError = consumer;
        this.onComplete = action;
    }

    public final void onComplete() {
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.a(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public final void onError(Throwable th) {
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            Exceptions.b(th2);
            RxJavaPlugins.a(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.b(this, disposable);
    }

    public final void bf_() {
        DisposableHelper.a((AtomicReference<Disposable>) this);
    }

    public final boolean b() {
        return get() == DisposableHelper.DISPOSED;
    }

    public final boolean bb_() {
        return this.onError != this;
    }
}
