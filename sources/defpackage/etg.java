package defpackage;

/* renamed from: etg reason: default package */
final class etg implements Runnable {
    private final /* synthetic */ ewa a;
    private final /* synthetic */ ewh b;
    private final /* synthetic */ esr c;

    etg(esr esr, ewa ewa, ewh ewh) {
        this.c = esr;
        this.a = ewa;
        this.b = ewh;
    }

    public final void run() {
        this.c.a.k();
        this.c.a.b(this.a, this.b);
    }
}
