package defpackage;

/* renamed from: iao reason: default package */
public final class iao {
    private final ial a;
    private final iin b;
    private final szp c;
    private iap d;
    private boolean e;
    private final iii f;

    public iao(ial ial, iin iin, szp szp, iij iij) {
        this.a = ial;
        this.b = iin;
        this.c = szp;
        this.f = iij.a(this.a.b());
    }

    public final void a() {
        this.c.a(this.a.e());
        this.b.a("clicked", this.a.a());
    }

    public final void a(iap iap) {
        this.d = iap;
        this.d.a(this.f);
        this.d.b(this.a.b());
        this.d.a_(this.a.c());
        this.d.c(this.a.d());
    }

    public final void b() {
        this.d.a();
        this.b.a("ended", this.a.a());
    }

    public final void c() {
        if (!this.e) {
            this.b.a("viewed", this.a.a());
            this.e = true;
        }
    }

    public final void d() {
        this.b.a("errored", this.a.a());
        this.d.a();
    }
}
