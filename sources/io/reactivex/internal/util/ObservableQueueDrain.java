package io.reactivex.internal.util;

import io.reactivex.Observer;

public interface ObservableQueueDrain<T, U> {
    int a(int i);

    void a(Observer<? super U> observer, T t);

    boolean c();

    boolean d();

    Throwable f();
}
