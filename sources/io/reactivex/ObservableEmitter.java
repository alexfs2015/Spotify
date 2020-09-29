package io.reactivex;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;

public interface ObservableEmitter<T> extends Emitter<T> {
    void a(Disposable disposable);

    void a(Cancellable cancellable);

    boolean b();

    boolean b(Throwable th);
}
