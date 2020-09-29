package defpackage;

/* renamed from: eyk reason: default package */
final class eyk implements Runnable {
    private final /* synthetic */ exz a;
    private final /* synthetic */ eyj b;

    eyk(eyj eyj, exz exz) {
        this.b = eyj;
        this.a = exz;
    }

    public final void run() {
        synchronized (this.b.a) {
            if (this.b.b != null) {
                this.b.b.onComplete(this.a);
            }
        }
    }
}
