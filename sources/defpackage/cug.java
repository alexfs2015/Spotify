package defpackage;

/* renamed from: cug reason: default package */
final /* synthetic */ class cug implements Runnable {
    private final cuf a;

    cug(cuf cuf) {
        this.a = cuf;
    }

    public final void run() {
        cuf cuf = this.a;
        cuf.a.I();
        bgt t = cuf.a.t();
        if (t != null) {
            t.m();
        }
        if (cuf.f != null) {
            cuf.f.a();
            cuf.f = null;
        }
    }
}
