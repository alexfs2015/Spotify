package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

public final class OnSubscribeFromIterable<T> implements a<T> {
    private Iterable<? extends T> a;

    public static final class IterableProducer<T> extends AtomicLong implements xik {
        private static final long serialVersionUID = -8730475647105475802L;
        private final Iterator<? extends T> it;
        private final xio<? super T> o;

        public IterableProducer(xio<? super T> xio, Iterator<? extends T> it2) {
            this.o = xio;
            this.it = it2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x009b, code lost:
            r4 = defpackage.xje.b(r8, r9);
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
                xio<? super T> r9 = r8.o
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
                defpackage.xiq.a(r10, r9)
                goto L_0x00a4
            L_0x0046:
                r10 = move-exception
                defpackage.xiq.a(r10, r9)
                goto L_0x00a4
            L_0x004b:
                return
            L_0x004c:
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 <= 0) goto L_0x00a4
                long r2 = defpackage.xje.a(r8, r9)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x00a4
                xio<? super T> r2 = r8.o
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
                defpackage.xiq.a(r9, r2)
                return
            L_0x008e:
                r9 = move-exception
                defpackage.xiq.a(r9, r2)
                return
            L_0x0093:
                long r4 = r8.get()
                int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x005e
                long r4 = defpackage.xje.b(r8, r9)
                int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r9 == 0) goto L_0x00a4
                goto L_0x005d
            L_0x00a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OnSubscribeFromIterable.IterableProducer.a(long):void");
        }
    }

    public OnSubscribeFromIterable(Iterable<? extends T> iterable) {
        if (iterable != null) {
            this.a = iterable;
            return;
        }
        throw new NullPointerException("iterable must not be null");
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        try {
            Iterator it = this.a.iterator();
            boolean hasNext = it.hasNext();
            if (!xio.isUnsubscribed()) {
                if (!hasNext) {
                    xio.onCompleted();
                    return;
                }
                xio.setProducer(new IterableProducer(xio, it));
            }
        } catch (Throwable th) {
            xiq.a(th, (xij<?>) xio);
        }
    }
}
