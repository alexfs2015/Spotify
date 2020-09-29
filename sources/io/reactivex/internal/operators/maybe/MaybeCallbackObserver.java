package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class MaybeCallbackObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -6076952298809384986L;
    final Action onComplete;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onSuccess;

    public MaybeCallbackObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        this.onSuccess = consumer;
        this.onError = consumer2;
        this.onComplete = action;
    }

    public final boolean aZ_() {
        return this.onError != Functions.c;
    }

    public final boolean b() {
        return DisposableHelper.a((Disposable) get());
    }

    public final void bd_() {
        DisposableHelper.a((AtomicReference<Disposable>) this);
    }

    public final void c_(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.a(th);
        }
    }

    public final void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.a(th);
        }
    }

    public final void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            Exceptions.b(th2);
            RxJavaPlugins.a((Throwable) new CompositeException(th, th2));
        }
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.b(this, disposable);
    }
}
