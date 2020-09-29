package defpackage;

/* renamed from: cjp reason: default package */
final /* synthetic */ class cjp implements Runnable {
    private final cjn a;
    private final ckz b;

    cjp(cjn cjn, ckz ckz) {
        this.a = cjn;
        this.b = ckz;
    }

    public final void run() {
        cjn cjn = this.a;
        cjn.a.c.b(this.b);
    }
}
