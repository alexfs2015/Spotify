package defpackage;

/* renamed from: eym reason: default package */
final class eym implements Runnable {
    private final /* synthetic */ exz a;
    private final /* synthetic */ eyl b;

    eym(eyl eyl, exz exz) {
        this.b = eyl;
        this.a = exz;
    }

    public final void run() {
        synchronized (this.b.a) {
            if (this.b.b != null) {
                this.b.b.a(this.a.e());
            }
        }
    }
}
