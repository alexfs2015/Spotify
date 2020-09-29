package defpackage;

/* renamed from: esu reason: default package */
final class esu implements Runnable {
    private final /* synthetic */ ewl a;
    private final /* synthetic */ ewh b;
    private final /* synthetic */ esr c;

    esu(esr esr, ewl ewl, ewh ewh) {
        this.c = esr;
        this.a = ewl;
        this.b = ewh;
    }

    public final void run() {
        this.c.a.k();
        this.c.a.a(this.a, this.b);
    }
}
