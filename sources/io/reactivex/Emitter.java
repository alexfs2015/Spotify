package io.reactivex;

public interface Emitter<T> {
    void a(T t);

    void a(Throwable th);

    void c();
}
