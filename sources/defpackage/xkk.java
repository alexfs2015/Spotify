package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xkk reason: default package */
public final class xkk<T> implements b<T, T> {
    private long a;
    private TimeUnit b;
    private xil c;

    /* renamed from: xkk$a */
    static final class a<T> extends xio<T> implements xir {
        private static final Object b = new Object();
        private final xio<? super T> a;
        private AtomicReference<Object> c = new AtomicReference<>(b);

        public a(xio<? super T> xio) {
            this.a = xio;
        }

        private void a() {
            Object andSet = this.c.getAndSet(b);
            if (andSet != b) {
                try {
                    this.a.onNext(andSet);
                } catch (Throwable th) {
                    xiq.a(th, (xij<?>) this);
                }
            }
        }

        public final void call() {
            a();
        }

        public final void onCompleted() {
            a();
            this.a.onCompleted();
            unsubscribe();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
            unsubscribe();
        }

        public final void onNext(T t) {
            this.c.set(t);
        }

        public final void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public xkk(long j, TimeUnit timeUnit, xil xil) {
        this.a = j;
        this.b = timeUnit;
        this.c = xil;
    }

    public final /* synthetic */ Object call(Object obj) {
        xio xio = (xio) obj;
        xnt xnt = new xnt(xio);
        defpackage.xil.a c2 = this.c.c();
        xio.add(c2);
        a aVar = new a(xnt);
        xio.add(aVar);
        long j = this.a;
        c2.a(aVar, j, j, this.b);
        return aVar;
    }
}
