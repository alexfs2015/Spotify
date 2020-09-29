package io.reactivex;

public interface MaybeSource<T> {
    void a(MaybeObserver<? super T> maybeObserver);
}
