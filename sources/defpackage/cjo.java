package defpackage;

/* renamed from: cjo reason: default package */
final /* synthetic */ class cjo implements Runnable {
    private final cjn a;
    private final ckz b;

    cjo(cjn cjn, ckz ckz) {
        this.a = cjn;
        this.b = ckz;
    }

    public final void run() {
        cjn cjn = this.a;
        cjn.a.c.b(this.b);
    }
}
