package rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;

public final class SingleProducer<T> extends AtomicBoolean implements xik {
    private static final long serialVersionUID = -3353584923995471404L;
    final xio<? super T> child;
    final T value;

    public SingleProducer(xio<? super T> xio, T t) {
        this.child = xio;
        this.value = t;
    }

    public final void a(long j) {
        if (j >= 0) {
            if (j != 0 && compareAndSet(false, true)) {
                xio<? super T> xio = this.child;
                if (!xio.isUnsubscribed()) {
                    T t = this.value;
                    try {
                        xio.onNext(t);
                        if (!xio.isUnsubscribed()) {
                            xio.onCompleted();
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        xiq.a(th, xio, t);
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
