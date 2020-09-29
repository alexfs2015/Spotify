package defpackage;

/* renamed from: eug reason: default package */
final class eug implements Runnable {
    private final /* synthetic */ eqn a;
    private final /* synthetic */ euf b;

    eug(euf euf, eqn eqn) {
        this.b = euf;
        this.a = eqn;
    }

    public final void run() {
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.v()) {
                this.b.c.q().k.a("Connected to service");
                this.b.c.a(this.a);
            }
        }
    }
}
