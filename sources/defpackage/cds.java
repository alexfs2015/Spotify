package defpackage;

/* renamed from: cds reason: default package */
final class cds implements Runnable {
    private final /* synthetic */ clq a;
    private final /* synthetic */ cdq b;

    cds(cdq cdq, clq clq) {
        this.b = cdq;
        this.a = clq;
    }

    public final void run() {
        synchronized (this.b.c) {
            cdq cdq = this.b;
            cdq.a.b(this.a);
        }
    }
}
