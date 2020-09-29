package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;

public final class OnSubscribeFromArray<T> implements a<T> {
    private T[] a;

    static final class FromArrayProducer<T> extends AtomicLong implements wuf {
        private static final long serialVersionUID = 3534218984725836979L;
        final T[] array;
        final wuj<? super T> child;
        int index;

        public FromArrayProducer(wuj<? super T> wuj, T[] tArr) {
            this.child = wuj;
            this.array = tArr;
        }

        public final void a(long j) {
            if (j >= 0) {
                if (j == Long.MAX_VALUE) {
                    if (wuz.a((AtomicLong) this, j) == 0) {
                        a();
                        return;
                    }
                } else if (j != 0 && wuz.a((AtomicLong) this, j) == 0) {
                    b(j);
                }
                return;
            }
            StringBuilder sb = new StringBuilder("n >= 0 required but it was ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }

        private void a() {
            wuj<? super T> wuj = this.child;
            T[] tArr = this.array;
            int length = tArr.length;
            int i = 0;
            while (i < length) {
                T t = tArr[i];
                if (!wuj.isUnsubscribed()) {
                    wuj.onNext(t);
                    i++;
                } else {
                    return;
                }
            }
            if (!wuj.isUnsubscribed()) {
                wuj.onCompleted();
            }
        }

        private void b(long j) {
            wuj<? super T> wuj = this.child;
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
                    } else if (!wuj.isUnsubscribed()) {
                        wuj.onNext(tArr[i]);
                        i++;
                        if (i == length) {
                            if (!wuj.isUnsubscribed()) {
                                wuj.onCompleted();
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
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        wuj.setProducer(new FromArrayProducer(wuj, this.a));
    }

    public OnSubscribeFromArray(T[] tArr) {
        this.a = tArr;
    }
}
