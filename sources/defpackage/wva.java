package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wva reason: default package */
public final class wva implements a {
    final wub a;
    private wub b;
    private long c;
    private TimeUnit d;
    private wug e;

    public final /* synthetic */ void call(Object obj) {
        final wuc wuc = (wuc) obj;
        final xag xag = new xag();
        wuc.a((wuk) xag);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        a c2 = this.e.c();
        xag.a((wuk) c2);
        c2.a(new wum() {
            public final void call() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    xag.a();
                    if (wva.this.a == null) {
                        wuc.a((Throwable) new TimeoutException());
                        return;
                    }
                    wva.this.a.a((wuc) new wuc() {
                        public final void a(wuk wuk) {
                            xag.a(wuk);
                        }

                        public final void a(Throwable th) {
                            xag.unsubscribe();
                            wuc.a(th);
                        }

                        public final void a() {
                            xag.unsubscribe();
                            wuc.a();
                        }
                    });
                }
            }
        }, this.c, this.d);
        this.b.a((wuc) new wuc() {
            public final void a(wuk wuk) {
                xag.a(wuk);
            }

            public final void a(Throwable th) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    xag.unsubscribe();
                    wuc.a(th);
                    return;
                }
                wzs.a(th);
            }

            public final void a() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    xag.unsubscribe();
                    wuc.a();
                }
            }
        });
    }

    public wva(wub wub, long j, TimeUnit timeUnit, wug wug, wub wub2) {
        this.b = wub;
        this.c = j;
        this.d = timeUnit;
        this.e = wug;
        this.a = wub2;
    }
}
