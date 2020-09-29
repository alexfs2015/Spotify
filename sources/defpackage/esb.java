package defpackage;

/* renamed from: esb reason: default package */
final class esb implements Runnable {
    private final /* synthetic */ evq a;
    private final /* synthetic */ esa b;

    esb(esa esa, evq evq) {
        this.b = esa;
        this.a = evq;
    }

    public final void run() {
        this.b.a.k();
        evc a2 = this.b.a;
        evq evq = this.a;
        a2.g();
        a2.h();
        bwx.a(evq.a);
        a2.c(evq);
    }
}
