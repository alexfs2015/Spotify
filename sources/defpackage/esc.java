package defpackage;

/* renamed from: esc reason: default package */
final class esc implements Runnable {
    private final /* synthetic */ evu a;
    private final /* synthetic */ evq b;
    private final /* synthetic */ esa c;

    esc(esa esa, evu evu, evq evq) {
        this.c = esa;
        this.a = evu;
        this.b = evq;
    }

    public final void run() {
        this.c.a.k();
        this.c.a.b(this.a, this.b);
    }
}
