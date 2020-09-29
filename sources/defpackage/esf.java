package defpackage;

/* renamed from: esf reason: default package */
final class esf implements Runnable {
    private final /* synthetic */ evu a;
    private final /* synthetic */ esa b;

    esf(esa esa, evu evu) {
        this.b = esa;
        this.a = evu;
    }

    public final void run() {
        this.b.a.k();
        evc a2 = this.b.a;
        evu evu = this.a;
        evq a3 = a2.a(evu.a);
        if (a3 != null) {
            a2.b(evu, a3);
        }
    }
}
