package defpackage;

/* renamed from: euz reason: default package */
final class euz implements Runnable {
    private final /* synthetic */ ere a;
    private final /* synthetic */ euw b;

    euz(euw euw, ere ere) {
        this.b = euw;
        this.a = ere;
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
