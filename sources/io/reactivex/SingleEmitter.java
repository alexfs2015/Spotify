package io.reactivex;

import io.reactivex.functions.Cancellable;

public interface SingleEmitter<T> {
    void a(Cancellable cancellable);

    void a(T t);

    void a(Throwable th);

    boolean b();

    boolean b(Throwable th);
}
