package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

public final class OnSubscribeFromIterable<T> implements a<T> {
    private Iterable<? extends T> a;

    public static final class IterableProducer<T> extends AtomicLong implements wuf {
        private static final long serialVersionUID = -8730475647105475802L;
        private final Iterator<? extends T> it;
        private final wuj<? super T> o;

        public IterableProducer(wuj<? super T> wuj, Iterator<? extends T> it2) {
            this.o = wuj;
            this.it = it2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x009b, code lost:
            r4 = defpackage.wuz.b(r8, r9);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(long r9) {
            /*
                r8 = this;
                long r0 = r8.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x000e
                return
            L_0x000e:
                r0 = 0
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x004c
                boolean r2 = r8.compareAndSet(r0, r2)
                if (r2 == 0) goto L_0x004c
                wuj<? super T> r9 = r8.o
                java.util.Iterator<? extends T> r10 = r8.it
            L_0x001e:
                boolean r0 = r9.isUnsubscribed()
                if (r0 != 0) goto L_0x004b
                java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0046 }
                r9.onNext(r0)
                boolean r0 = r9.isUnsubscribed()
                if (r0 != 0) goto L_0x004b
                boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0041 }
                if (r0 != 0) goto L_0x001e
                boolean r10 = r9.isUnsubscribed()
                if (r10 != 0) goto L_0x00a4
                r9.onCompleted()
                goto L_0x00a4
            L_0x0041:
                r10 = move-exception
                defpackage.wul.a(r10, r9)
                goto L_0x00a4
            L_0x0046:
                r10 = move-exception
                defpackage.wul.a(r10, r9)
                goto L_0x00a4
            L_0x004b:
                return
            L_0x004c:
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 <= 0) goto L_0x00a4
                long r2 = defpackage.wuz.a(r8, r9)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x00a4
                wuj<? super T> r2 = r8.o
                java.util.Iterator<? extends T> r3 = r8.it
                r4 = r9
            L_0x005d:
                r9 = r0
            L_0x005e:
                int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x0093
                boolean r6 = r2.isUnsubscribed()
                if (r6 != 0) goto L_0x00a4
                java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x008e }
                r2.onNext(r6)
                boolean r6 = r2.isUnsubscribed()
                if (r6 != 0) goto L_0x00a4
                boolean r6 = r3.hasNext()     // Catch:{ all -> 0x0089 }
                if (r6 != 0) goto L_0x0085
                boolean r9 = r2.isUnsubscribed()
                if (r9 != 0) goto L_0x0084
                r2.onCompleted()
            L_0x0084:
                return
            L_0x0085:
                r6 = 1
                long r9 = r9 + r6
                goto L_0x005e
            L_0x0089:
                r9 = move-exception
                defpackage.wul.a(r9, r2)
                return
            L_0x008e:
                r9 = move-exception
                defpackage.wul.a(r9, r2)
                return
            L_0x0093:
                long r4 = r8.get()
                int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x005e
                long r4 = defpackage.wuz.b(r8, r9)
                int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r9 == 0) goto L_0x00a4
                goto L_0x005d
            L_0x00a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OnSubscribeFromIterable.IterableProducer.a(long):void");
        }
    }

    public final /* synthetic */ void call(Object obj) {
        wuj wuj = (wuj) obj;
        try {
            Iterator it = this.a.iterator();
            boolean hasNext = it.hasNext();
            if (!wuj.isUnsubscribed()) {
                if (!hasNext) {
                    wuj.onCompleted();
                    return;
                }
                wuj.setProducer(new IterableProducer(wuj, it));
            }
        } catch (Throwable th) {
            wul.a(th, (wue<?>) wuj);
        }
    }

    public OnSubscribeFromIterable(Iterable<? extends T> iterable) {
        if (iterable != null) {
            this.a = iterable;
            return;
        }
        throw new NullPointerException("iterable must not be null");
    }
}
