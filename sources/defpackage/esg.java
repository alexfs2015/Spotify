package defpackage;

/* renamed from: esg reason: default package */
final class esg implements Runnable {
    private final /* synthetic */ evu a;
    private final /* synthetic */ esa b;

    esg(esa esa, evu evu) {
        this.b = esa;
        this.a = evu;
    }

    public final void run() {
        this.b.a.k();
        evc a2 = this.b.a;
        evu evu = this.a;
        evq a3 = a2.a(evu.a);
        if (a3 != null) {
            a2.a(evu, a3);
        }
    }
}
