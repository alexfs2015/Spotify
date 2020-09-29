package io.reactivex.internal.observers;

public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    public final void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }

    public final void onNext(T t) {
        if (this.a == null) {
            this.a = t;
            this.c.bd_();
            countDown();
        }
    }
}
