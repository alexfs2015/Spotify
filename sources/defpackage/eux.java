package defpackage;

/* renamed from: eux reason: default package */
final class eux implements Runnable {
    private final /* synthetic */ ere a;
    private final /* synthetic */ euw b;

    eux(euw euw, ere ere) {
        this.b = euw;
        this.a = ere;
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
