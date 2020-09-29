package defpackage;

/* renamed from: cjw reason: default package */
final class cjw implements Runnable {
    private final /* synthetic */ dpp a;
    private final /* synthetic */ edj b;
    private final /* synthetic */ cjv c;

    cjw(cjv cjv, dpp dpp, edj edj) {
        this.c = cjv;
        this.a = dpp;
        this.b = edj;
    }

    public final void run() {
        this.c.a(this.a, this.b);
    }
}
