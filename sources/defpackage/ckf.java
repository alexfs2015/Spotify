package defpackage;

/* renamed from: ckf reason: default package */
final /* synthetic */ class ckf implements Runnable {
    private final cke a;
    private final clq b;

    ckf(cke cke, clq clq) {
        this.a = cke;
        this.b = clq;
    }

    public final void run() {
        cke cke = this.a;
        cke.a.c.b(this.b);
    }
}
