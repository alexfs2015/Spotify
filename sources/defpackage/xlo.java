package defpackage;

/* renamed from: xlo reason: default package */
final class xlo implements xir {
    private final xir a;
    private final a b;
    private final long c;

    public xlo(xir xir, a aVar, long j) {
        this.a = xir;
        this.b = aVar;
        this.c = j;
    }

    public final void call() {
        if (!this.b.isUnsubscribed()) {
            long a2 = this.c - this.b.a();
            if (a2 > 0) {
                try {
                    Thread.sleep(a2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    xiq.a((Throwable) e);
                }
            }
            if (!this.b.isUnsubscribed()) {
                this.a.call();
            }
        }
    }
}
