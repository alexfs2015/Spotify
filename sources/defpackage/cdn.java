package defpackage;

/* renamed from: cdn reason: default package */
final /* synthetic */ class cdn implements Runnable {
    private final cdm a;
    private final cqc b;
    private final String c;

    cdn(cdm cdm, cqc cqc, String str) {
        this.a = cdm;
        this.b = cqc;
        this.c = str;
    }

    public final void run() {
        cdm cdm = this.a;
        cqc cqc = this.b;
        String str = this.c;
        try {
            bjl.f();
            csr a2 = csy.a(cdm.a, cue.a(), "native-omid", false, false, cdm.c, cdm.d.a.k, cdm.e, null, cdm.b.i(), cdm.d.i);
            a2.x().a((ctz) new cdo(cqc, a2));
            a2.loadData(str, "text/html", "UTF-8");
        } catch (Exception unused) {
            cqc.b(null);
            cow.a(5);
        }
    }
}
