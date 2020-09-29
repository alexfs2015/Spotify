package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.fuseable.ScalarCallable;

public final class MaybeJust<T> extends Maybe<T> implements ScalarCallable<T> {
    private T a;

    public MaybeJust(T t) {
        this.a = t;
    }

    public final void b(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(Disposables.b());
        maybeObserver.c_(this.a);
    }

    public final T call() {
        return this.a;
    }
}
