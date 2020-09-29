package defpackage;

/* renamed from: eaq reason: default package */
final class eaq implements cqh<dzv> {
    private final /* synthetic */ eay a;
    private final /* synthetic */ eah b;

    eaq(eah eah, eay eay) {
        this.b = eah;
        this.a = eay;
    }

    public final /* synthetic */ void a(Object obj) {
        synchronized (this.b.a) {
            this.b.g = 0;
            if (!(this.b.f == null || this.a == this.b.f)) {
                clu.a();
                this.b.f.d();
            }
            this.b.f = this.a;
        }
    }
}
