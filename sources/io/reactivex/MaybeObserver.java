package io.reactivex;

import io.reactivex.disposables.Disposable;

public interface MaybeObserver<T> {
    void c_(T t);

    void onComplete();

    void onError(Throwable th);

    void onSubscribe(Disposable disposable);
}
