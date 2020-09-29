package defpackage;

/* renamed from: eui reason: default package */
final class eui implements Runnable {
    private final /* synthetic */ eqn a;
    private final /* synthetic */ euf b;

    eui(euf euf, eqn eqn) {
        this.b = euf;
        this.a = eqn;
    }

    public final void run() {
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.v()) {
                this.b.c.q().j.a("Connected to remote service");
                this.b.c.a(this.a);
            }
        }
    }
}
