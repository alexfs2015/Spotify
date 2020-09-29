package defpackage;

/* renamed from: ear reason: default package */
final class ear implements cqf {
    private final /* synthetic */ eay a;
    private final /* synthetic */ eah b;

    ear(eah eah, eay eay) {
        this.b = eah;
        this.a = eay;
    }

    public final void a() {
        synchronized (this.b.a) {
            this.b.g = 1;
            clu.a();
            this.a.d();
        }
    }
}
