package io.reactivex;

import io.reactivex.disposables.Disposable;

public interface SingleObserver<T> {
    void c_(T t);

    void onError(Throwable th);

    void onSubscribe(Disposable disposable);
}
