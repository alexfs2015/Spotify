package io.reactivex.internal.observers;

import io.reactivex.Observer;
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

public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;
    final Action onComplete;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onNext;
    final Consumer<? super Disposable> onSubscribe;

    public LambdaObserver(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onSubscribe = consumer3;
    }

    public final boolean aZ_() {
        return this.onError != Functions.c;
    }

    public final boolean b() {
        return get() == DisposableHelper.DISPOSED;
    }

    public final void bd_() {
        DisposableHelper.a((AtomicReference<Disposable>) this);
    }

    public final void onComplete() {
        if (!b()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.a(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (!b()) {
            lazySet(DisposableHelper.DISPOSED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                RxJavaPlugins.a((Throwable) new CompositeException(th, th2));
            }
        } else {
            RxJavaPlugins.a(th);
        }
    }

    public final void onNext(T t) {
        if (!b()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                Exceptions.b(th);
                ((Disposable) get()).bd_();
                onError(th);
            }
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.b(this, disposable)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                Exceptions.b(th);
                disposable.bd_();
                onError(th);
            }
        }
    }
}
