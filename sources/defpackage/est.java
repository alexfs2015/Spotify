package defpackage;

/* renamed from: est reason: default package */
final class est implements Runnable {
    private final /* synthetic */ ewl a;
    private final /* synthetic */ ewh b;
    private final /* synthetic */ esr c;

    est(esr esr, ewl ewl, ewh ewh) {
        this.c = esr;
        this.a = ewl;
        this.b = ewh;
    }

    public final void run() {
        this.c.a.k();
        this.c.a.b(this.a, this.b);
    }
}
