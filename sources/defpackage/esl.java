package defpackage;

/* renamed from: esl reason: default package */
final class esl implements Runnable {
    private final /* synthetic */ evq a;
    private final /* synthetic */ esa b;

    esl(esa esa, evq evq) {
        this.b = esa;
        this.a = evq;
    }

    public final void run() {
        this.b.a.k();
        this.b.a.a(this.a);
    }
}
