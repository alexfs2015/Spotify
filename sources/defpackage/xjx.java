package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xjx reason: default package */
public final class xjx implements a<Long> {
    private long a;
    private long b;
    private TimeUnit c;
    private xil d;

    public xjx(long j, long j2, TimeUnit timeUnit, xil xil) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = xil;
    }

    public final /* synthetic */ void call(Object obj) {
        final xio xio = (xio) obj;
        final a c2 = this.d.c();
        xio.add(c2);
        c2.a(new xir() {
            private long a;

            public final void call() {
                try {
                    xio xio = xio;
                    long j = this.a;
                    this.a = 1 + j;
                    xio.onNext(Long.valueOf(j));
                } catch (Throwable th) {
                    xiq.a(th, (xij<?>) xio);
                    throw th;
                }
            }
        }, this.a, this.b, this.c);
    }
}
