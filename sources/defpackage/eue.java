package defpackage;

/* renamed from: eue reason: default package */
final class eue implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ evj b;
    private final /* synthetic */ evq c;
    private final /* synthetic */ ets d;

    eue(ets ets, boolean z, evj evj, evq evq) {
        this.d = ets;
        this.a = z;
        this.b = evj;
        this.c = evq;
    }

    public final void run() {
        eqn eqn = this.d.b;
        if (eqn == null) {
            this.d.q().c.a("Discarding data. Failed to set user attribute");
            return;
        }
        this.d.a(eqn, this.a ? null : this.b, this.c);
        this.d.y();
    }
}
