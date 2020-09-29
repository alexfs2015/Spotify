package defpackage;

/* renamed from: esw reason: default package */
final class esw implements Runnable {
    private final /* synthetic */ ewl a;
    private final /* synthetic */ esr b;

    esw(esr esr, ewl ewl) {
        this.b = esr;
        this.a = ewl;
    }

    public final void run() {
        this.b.a.k();
        evt a2 = this.b.a;
        ewl ewl = this.a;
        ewh a3 = a2.a(ewl.a);
        if (a3 != null) {
            a2.b(ewl, a3);
        }
    }
}
