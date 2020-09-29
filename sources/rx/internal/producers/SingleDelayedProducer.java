package rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;

public final class SingleDelayedProducer<T> extends AtomicInteger implements xik {
    private static final long serialVersionUID = -2873467947112093874L;
    final xio<? super T> child;
    T value;

    public SingleDelayedProducer(xio<? super T> xio) {
        this.child = xio;
    }

    private static <T> void a(xio<? super T> xio, T t) {
        if (!xio.isUnsubscribed()) {
            try {
                xio.onNext(t);
                if (!xio.isUnsubscribed()) {
                    xio.onCompleted();
                }
            } catch (Throwable th) {
                xiq.a(th, xio, t);
            }
        }
    }

    public final void a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (j != 0) {
            while (true) {
                int i = get();
                if (i == 0) {
                    if (compareAndSet(0, 2)) {
                        break;
                    }
                } else if (i == 1 && compareAndSet(1, 3)) {
                    a(this.child, this.value);
                }
            }
        }
    }

    public final void a(T t) {
        do {
            int i = get();
            if (i == 0) {
                this.value = t;
            } else if (i == 2 && compareAndSet(2, 3)) {
                a(this.child, t);
                return;
            } else {
                return;
            }
        } while (!compareAndSet(0, 1));
    }
}
