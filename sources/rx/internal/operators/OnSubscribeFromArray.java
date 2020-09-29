package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;

public final class OnSubscribeFromArray<T> implements a<T> {
    private T[] a;

    static final class FromArrayProducer<T> extends AtomicLong implements xik {
        private static final long serialVersionUID = 3534218984725836979L;
        final T[] array;
        final xio<? super T> child;
        int index;

        public FromArrayProducer(xio<? super T> xio, T[] tArr) {
            this.child = xio;
            this.array = tArr;
        }

        private void a() {
            xio<? super T> xio = this.child;
            T[] tArr = this.array;
            int length = tArr.length;
            int i = 0;
            while (i < length) {
                T t = tArr[i];
                if (!xio.isUnsubscribed()) {
                    xio.onNext(t);
                    i++;
                } else {
                    return;
                }
            }
            if (!xio.isUnsubscribed()) {
                xio.onCompleted();
            }
        }

        private void b(long j) {
            xio<? super T> xio = this.child;
            T[] tArr = this.array;
            int length = tArr.length;
            int i = this.index;
            do {
                long j2 = 0;
                while (true) {
                    if (r11 == 0 || i == length) {
                        r11 = get() + j2;
                        if (r11 == 0) {
                            this.index = i;
                            j = addAndGet(j2);
                        }
                    } else if (!xio.isUnsubscribed()) {
                        xio.onNext(tArr[i]);
                        i++;
                        if (i == length) {
                            if (!xio.isUnsubscribed()) {
                                xio.onCompleted();
                            }
                            return;
                        }
                        r11--;
                        j2--;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }

        public final void a(long j) {
            if (j >= 0) {
                if (j == Long.MAX_VALUE) {
                    if (xje.a((AtomicLong) this, j) == 0) {
                        a();
                        return;
                    }
                } else if (j != 0 && xje.a((AtomicLong) this, j) == 0) {
                    b(j);
                }
                return;
            }
            StringBuilder sb = new StringBuilder("n >= 0 required but it was ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public OnSubscribeFromArray(T[] tArr) {
        this.a = tArr;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        xio.setProducer(new FromArrayProducer(xio, this.a));
    }
}
