package rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;

public final class SingleDelayedProducer<T> extends AtomicInteger implements wuf {
    private static final long serialVersionUID = -2873467947112093874L;
    final wuj<? super T> child;
    T value;

    public SingleDelayedProducer(wuj<? super T> wuj) {
        this.child = wuj;
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

    private static <T> void a(wuj<? super T> wuj, T t) {
        if (!wuj.isUnsubscribed()) {
            try {
                wuj.onNext(t);
                if (!wuj.isUnsubscribed()) {
                    wuj.onCompleted();
                }
            } catch (Throwable th) {
                wul.a(th, wuj, t);
            }
        }
    }
}
