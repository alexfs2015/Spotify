package defpackage;

/* renamed from: cux reason: default package */
final /* synthetic */ class cux implements Runnable {
    private final cuw a;

    cux(cuw cuw) {
        this.a = cuw;
    }

    public final void run() {
        cuw cuw = this.a;
        cuw.a.I();
        bhk t = cuw.a.t();
        if (t != null) {
            t.m();
        }
        if (cuw.f != null) {
            cuw.f.a();
            cuw.f = null;
        }
    }
}
