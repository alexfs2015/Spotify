package rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;

public final class SingleProducer<T> extends AtomicBoolean implements wuf {
    private static final long serialVersionUID = -3353584923995471404L;
    final wuj<? super T> child;
    final T value;

    public SingleProducer(wuj<? super T> wuj, T t) {
        this.child = wuj;
        this.value = t;
    }

    public final void a(long j) {
        if (j >= 0) {
            if (j != 0 && compareAndSet(false, true)) {
                wuj<? super T> wuj = this.child;
                if (!wuj.isUnsubscribed()) {
                    T t = this.value;
                    try {
                        wuj.onNext(t);
                        if (!wuj.isUnsubscribed()) {
                            wuj.onCompleted();
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        wul.a(th, wuj, t);
                    }
                } else {
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("n >= 0 required");
    }
}
