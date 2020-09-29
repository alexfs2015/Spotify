package defpackage;

/* renamed from: eyo reason: default package */
final class eyo implements Runnable {
    private final /* synthetic */ exz a;
    private final /* synthetic */ eyn b;

    eyo(eyn eyn, exz exz) {
        this.b = eyn;
        this.a = exz;
    }

    public final void run() {
        synchronized (this.b.a) {
            if (this.b.b != null) {
                this.b.b.a(this.a.d());
            }
        }
    }
}
