package io.reactivex;

public interface SingleSource<T> {
    void b(SingleObserver<? super T> singleObserver);
}
