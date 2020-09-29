package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xjf reason: default package */
public final class xjf implements a {
    final xig a;
    private xig b;
    private long c;
    private TimeUnit d;
    private xil e;

    public xjf(xig xig, long j, TimeUnit timeUnit, xil xil, xig xig2) {
        this.b = xig;
        this.c = j;
        this.d = timeUnit;
        this.e = xil;
        this.a = xig2;
    }

    public final /* synthetic */ void call(Object obj) {
        final xih xih = (xih) obj;
        final xok xok = new xok();
        xih.a((xip) xok);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        a c2 = this.e.c();
        xok.a((xip) c2);
        c2.a(new xir() {
            public final void call() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    xok.a();
                    if (xjf.this.a == null) {
                        xih.a((Throwable) new TimeoutException());
                        return;
                    }
                    xjf.this.a.a((xih) new xih() {
                        public final void a() {
                            xok.unsubscribe();
                            xih.a();
                        }

                        public final void a(Throwable th) {
                            xok.unsubscribe();
                            xih.a(th);
                        }

                        public final void a(xip xip) {
                            xok.a(xip);
                        }
                    });
                }
            }
        }, this.c, this.d);
        this.b.a((xih) new xih() {
            public final void a() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    xok.unsubscribe();
                    xih.a();
                }
            }

            public final void a(Throwable th) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    xok.unsubscribe();
                    xih.a(th);
                    return;
                }
                xnx.a(th);
            }

            public final void a(xip xip) {
                xok.a(xip);
            }
        });
    }
}
