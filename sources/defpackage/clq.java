package defpackage;

/* renamed from: clq reason: default package */
final class clq implements Runnable {
    private final /* synthetic */ clp a;

    clq(clp clp) {
        this.a = clp;
    }

    public final void run() {
        this.a.j = Thread.currentThread();
        this.a.a();
    }
}
