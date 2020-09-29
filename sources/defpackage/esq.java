package defpackage;

/* renamed from: esq reason: default package */
final class esq implements Runnable {
    private final /* synthetic */ evj a;
    private final /* synthetic */ evq b;
    private final /* synthetic */ esa c;

    esq(esa esa, evj evj, evq evq) {
        this.c = esa;
        this.a = evj;
        this.b = evq;
    }

    public final void run() {
        this.c.a.k();
        this.c.a.a(this.a, this.b);
    }
}
