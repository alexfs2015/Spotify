package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xjw reason: default package */
public final class xjw implements a<Long> {
    private long a;
    private TimeUnit b;
    private xil c;

    public xjw(long j, TimeUnit timeUnit, xil xil) {
        this.a = j;
        this.b = timeUnit;
        this.c = xil;
    }

    public final /* synthetic */ void call(Object obj) {
        final xio xio = (xio) obj;
        a c2 = this.c.c();
        xio.add(c2);
        c2.a(new xir() {
            public final void call() {
                try {
                    xio.onNext(Long.valueOf(0));
                    xio.onCompleted();
                } catch (Throwable th) {
                    xiq.a(th, (xij<?>) xio);
                }
            }
        }, this.a, this.b);
    }
}
