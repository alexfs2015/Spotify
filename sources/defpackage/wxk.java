package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wxk reason: default package */
public final class wxk extends wug {
    public static final wxk a = new wxk();

    /* renamed from: wxk$a */
    static final class a extends defpackage.wug.a implements wuk {
        final PriorityBlockingQueue<b> a = new PriorityBlockingQueue<>();
        private AtomicInteger b = new AtomicInteger();
        private final xaf c = new xaf();
        private final AtomicInteger d = new AtomicInteger();

        a() {
        }

        public final wuk a(wum wum) {
            return a(wum, a());
        }

        public final wuk a(wum wum, long j, TimeUnit timeUnit) {
            long a2 = a() + timeUnit.toMillis(j);
            return a(new wxj(wum, this, a2), a2);
        }

        private wuk a(wum wum, long j) {
            if (this.c.isUnsubscribed()) {
                return xaj.b();
            }
            final b bVar = new b(wum, Long.valueOf(j), this.b.incrementAndGet());
            this.a.add(bVar);
            if (this.d.getAndIncrement() != 0) {
                return xaj.a((wum) new wum() {
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
            return xaj.b();
        }

        public final void unsubscribe() {
            this.c.unsubscribe();
        }

        public final boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }
    }

    /* renamed from: wxk$b */
    static final class b implements Comparable<b> {
        final wum a;
        private Long b;
        private int c;

        public final /* synthetic */ int compareTo(Object obj) {
            b bVar = (b) obj;
            int compareTo = this.b.compareTo(bVar.b);
            return compareTo == 0 ? wxk.a(this.c, bVar.c) : compareTo;
        }

        b(wum wum, Long l, int i) {
            this.a = wum;
            this.b = l;
            this.c = i;
        }
    }

    static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final defpackage.wug.a c() {
        return new a();
    }

    private wxk() {
    }
}
