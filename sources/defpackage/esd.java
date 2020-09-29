package defpackage;

/* renamed from: esd reason: default package */
final class esd implements Runnable {
    private final /* synthetic */ evu a;
    private final /* synthetic */ evq b;
    private final /* synthetic */ esa c;

    esd(esa esa, evu evu, evq evq) {
        this.c = esa;
        this.a = evu;
        this.b = evq;
    }

    public final void run() {
        this.c.a.k();
        this.c.a.a(this.a, this.b);
    }
}
