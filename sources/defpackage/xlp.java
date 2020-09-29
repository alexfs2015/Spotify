package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xlp reason: default package */
public final class xlp extends xil {
    public static final xlp a = new xlp();

    /* renamed from: xlp$a */
    static final class a extends defpackage.xil.a implements xip {
        final PriorityBlockingQueue<b> a = new PriorityBlockingQueue<>();
        private AtomicInteger b = new AtomicInteger();
        private final xoj c = new xoj();
        private final AtomicInteger d = new AtomicInteger();

        a() {
        }

        private xip a(xir xir, long j) {
            if (this.c.isUnsubscribed()) {
                return xon.b();
            }
            final b bVar = new b(xir, Long.valueOf(j), this.b.incrementAndGet());
            this.a.add(bVar);
            if (this.d.getAndIncrement() != 0) {
                return xon.a((xir) new xir() {
                    public final void call() {
                        a.this.a.remove(bVar);
                    }
                });
            }
            do {
                b bVar2 = (b) this.a.poll();
                if (bVar2 != null) {
                    bVar2.a.call();
                }
            } while (this.d.decrementAndGet() > 0);
            return xon.b();
        }

        public final xip a(xir xir) {
            return a(xir, a());
        }

        public final xip a(xir xir, long j, TimeUnit timeUnit) {
            long a2 = a() + timeUnit.toMillis(j);
            return a(new xlo(xir, this, a2), a2);
        }

        public final boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }

        public final void unsubscribe() {
            this.c.unsubscribe();
        }
    }

    /* renamed from: xlp$b */
    static final class b implements Comparable<b> {
        final xir a;
        private Long b;
        private int c;

        b(xir xir, Long l, int i) {
            this.a = xir;
            this.b = l;
            this.c = i;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            b bVar = (b) obj;
            int compareTo = this.b.compareTo(bVar.b);
            return compareTo == 0 ? xlp.a(this.c, bVar.c) : compareTo;
        }
    }

    private xlp() {
    }

    static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final defpackage.xil.a c() {
        return new a();
    }
}
