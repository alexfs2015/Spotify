package io.reactivex.internal.disposables;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.internal.fuseable.QueueDisposable;

public enum EmptyDisposable implements QueueDisposable<Object> {
    INSTANCE,
    NEVER;

    public final int a(int i) {
        return i & 2;
    }

    public final Object bc_() {
        return null;
    }

    public final void bf_() {
    }

    public final boolean d() {
        return true;
    }

    public final void e() {
    }

    public final boolean b() {
        return this == INSTANCE;
    }

    public static void a(Observer<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void a(MaybeObserver<?> maybeObserver) {
        maybeObserver.onSubscribe(INSTANCE);
        maybeObserver.onComplete();
    }

    public static void a(Throwable th, Observer<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(th);
    }

    public static void a(CompletableObserver completableObserver) {
        completableObserver.onSubscribe(INSTANCE);
        completableObserver.onComplete();
    }

    public static void a(Throwable th, CompletableObserver completableObserver) {
        completableObserver.onSubscribe(INSTANCE);
        completableObserver.onError(th);
    }

    public static void a(Throwable th, SingleObserver<?> singleObserver) {
        singleObserver.onSubscribe(INSTANCE);
        singleObserver.onError(th);
    }

    public static void a(Throwable th, MaybeObserver<?> maybeObserver) {
        maybeObserver.onSubscribe(INSTANCE);
        maybeObserver.onError(th);
    }

    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
