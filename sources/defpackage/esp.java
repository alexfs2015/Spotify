package defpackage;

/* renamed from: esp reason: default package */
final class esp implements Runnable {
    private final /* synthetic */ evj a;
    private final /* synthetic */ evq b;
    private final /* synthetic */ esa c;

    esp(esa esa, evj evj, evq evq) {
        this.c = esa;
        this.a = evj;
        this.b = evq;
    }

    public final void run() {
        this.c.a.k();
        this.c.a.b(this.a, this.b);
    }
}
