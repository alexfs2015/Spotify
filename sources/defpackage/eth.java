package defpackage;

/* renamed from: eth reason: default package */
final class eth implements Runnable {
    private final /* synthetic */ ewa a;
    private final /* synthetic */ ewh b;
    private final /* synthetic */ esr c;

    eth(esr esr, ewa ewa, ewh ewh) {
        this.c = esr;
        this.a = ewa;
        this.b = ewh;
    }

    public final void run() {
        this.c.a.k();
        this.c.a.a(this.a, this.b);
    }
}
