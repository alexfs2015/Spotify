package defpackage;

/* renamed from: evd reason: default package */
final class evd implements Runnable {
    private final /* synthetic */ evh a;
    private final /* synthetic */ evc b;

    evd(evc evc, evh evh) {
        this.b = evc;
        this.a = evh;
    }

    public final void run() {
        evc.a(this.b, this.a);
        this.b.a();
    }
}
