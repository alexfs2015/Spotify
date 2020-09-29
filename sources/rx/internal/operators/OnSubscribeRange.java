package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;

public final class OnSubscribeRange implements a<Integer> {
    private final int a;
    private final int b;

    static final class RangeProducer extends AtomicLong implements xik {
        private static final long serialVersionUID = 4114392207069098388L;
        private final xio<? super Integer> childSubscriber;
        private long currentIndex;
        private final int endOfRange;

        RangeProducer(xio<? super Integer> xio, int i, int i2) {
            this.childSubscriber = xio;
            this.currentIndex = (long) i;
            this.endOfRange = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
            r12.currentIndex = r9;
            r6 = addAndGet(-r13);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(long r13) {
            /*
                r12 = this;
                long r0 = r12.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x000e
                return
            L_0x000e:
                r0 = 1
                r4 = 0
                int r6 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
                if (r6 != 0) goto L_0x0042
                boolean r2 = r12.compareAndSet(r4, r2)
                if (r2 == 0) goto L_0x0042
                int r13 = r12.endOfRange
                long r13 = (long) r13
                long r13 = r13 + r0
                xio<? super java.lang.Integer> r2 = r12.childSubscriber
                long r3 = r12.currentIndex
            L_0x0024:
                int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
                if (r5 == 0) goto L_0x0038
                boolean r5 = r2.isUnsubscribed()
                if (r5 != 0) goto L_0x0041
                int r5 = (int) r3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r2.onNext(r5)
                long r3 = r3 + r0
                goto L_0x0024
            L_0x0038:
                boolean r13 = r2.isUnsubscribed()
                if (r13 != 0) goto L_0x0041
                r2.onCompleted()
            L_0x0041:
                return
            L_0x0042:
                int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0094
                long r2 = defpackage.xje.a(r12, r13)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x0094
                int r2 = r12.endOfRange
                long r2 = (long) r2
                long r2 = r2 + r0
                long r6 = r12.currentIndex
                xio<? super java.lang.Integer> r8 = r12.childSubscriber
                r9 = r6
                r6 = r13
            L_0x0058:
                r13 = r4
            L_0x0059:
                int r11 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r11 == 0) goto L_0x0072
                int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r11 == 0) goto L_0x0072
                boolean r11 = r8.isUnsubscribed()
                if (r11 != 0) goto L_0x0094
                int r11 = (int) r9
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r8.onNext(r11)
                long r9 = r9 + r0
                long r13 = r13 + r0
                goto L_0x0059
            L_0x0072:
                boolean r6 = r8.isUnsubscribed()
                if (r6 != 0) goto L_0x0094
                int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r6 != 0) goto L_0x0080
                r8.onCompleted()
                return
            L_0x0080:
                long r6 = r12.get()
                int r11 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
                if (r11 != 0) goto L_0x0059
                r12.currentIndex = r9
                long r13 = -r13
                long r6 = r12.addAndGet(r13)
                int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r13 == 0) goto L_0x0094
                goto L_0x0058
            L_0x0094:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OnSubscribeRange.RangeProducer.a(long):void");
        }
    }

    public OnSubscribeRange(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final /* synthetic */ void call(Object obj) {
        xio xio = (xio) obj;
        xio.setProducer(new RangeProducer(xio, this.a, this.b));
    }
}
