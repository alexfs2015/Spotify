package io.reactivex;

import io.reactivex.functions.Cancellable;

public interface CompletableEmitter {
    void a(Cancellable cancellable);

    void a(Throwable th);

    boolean b(Throwable th);

    void c();
}
