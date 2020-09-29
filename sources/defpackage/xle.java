package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xle reason: default package */
public final class xle<T> implements defpackage.xim.a<T> {
    private defpackage.xim.a<T> a;
    private long b;
    private TimeUnit c;
    private xil d;
    private defpackage.xim.a<? extends T> e;

    /* renamed from: xle$a */
    static final class a<T> extends xin<T> implements xir {
        private xin<? super T> a;
        private AtomicBoolean b = new AtomicBoolean();
        private defpackage.xim.a<? extends T> c;

        /* renamed from: xle$a$a reason: collision with other inner class name */
        static final class C0092a<T> extends xin<T> {
            private xin<? super T> a;

            C0092a(xin<? super T> xin) {
                this.a = xin;
            }

            public final void a(T t) {
                this.a.a(t);
            }

            public final void a(Throwable th) {
                this.a.a(th);
            }
        }

        a(xin<? super T> xin, defpackage.xim.a<? extends T> aVar) {
            this.a = xin;
            this.c = aVar;
        }

        public final void a(T t) {
            if (this.b.compareAndSet(false, true)) {
                try {
                    this.a.a(t);
                } finally {
                    unsubscribe();
                }
            }
        }

        public final void a(Throwable th) {
            if (this.b.compareAndSet(false, true)) {
                try {
                    this.a.a(th);
                } finally {
                    unsubscribe();
                }
            } else {
                xnx.a(th);
            }
        }

        public final void call() {
            if (this.b.compareAndSet(false, true)) {
                try {
                    defpackage.xim.a<? extends T> aVar = this.c;
                    if (aVar == null) {
                        this.a.a((Throwable) new TimeoutException());
                    } else {
                        C0092a aVar2 = new C0092a(this.a);
                        this.a.a((xip) aVar2);
                        aVar.call(aVar2);
                    }
                } finally {
                    unsubscribe();
                }
            }
        }
    }

    public xle(defpackage.xim.a<T> aVar, long j, TimeUnit timeUnit, xil xil, defpackage.xim.a<? extends T> aVar2) {
        this.a = aVar;
        this.b = j;
        this.c = timeUnit;
        this.d = xil;
        this.e = aVar2;
    }

    public final /* synthetic */ void call(Object obj) {
        xin xin = (xin) obj;
        a aVar = new a(xin, this.e);
        defpackage.xil.a c2 = this.d.c();
        aVar.a((xip) c2);
        xin.a((xip) aVar);
        c2.a(aVar, this.b, this.c);
        this.a.call(aVar);
    }
}
