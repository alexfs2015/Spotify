package defpackage;

/* renamed from: cee reason: default package */
final /* synthetic */ class cee implements Runnable {
    private final ced a;
    private final cqt b;
    private final String c;

    cee(ced ced, cqt cqt, String str) {
        this.a = ced;
        this.b = cqt;
        this.c = str;
    }

    public final void run() {
        ced ced = this.a;
        cqt cqt = this.b;
        String str = this.c;
        try {
            bkc.f();
            cti a2 = ctp.a(ced.a, cuv.a(), "native-omid", false, false, ced.c, ced.d.a.k, ced.e, null, ced.b.i(), ced.d.i);
            a2.x().a((cuq) new cef(cqt, a2));
            a2.loadData(str, "text/html", "UTF-8");
        } catch (Exception unused) {
            cqt.b(null);
            cpn.a(5);
        }
    }
}
