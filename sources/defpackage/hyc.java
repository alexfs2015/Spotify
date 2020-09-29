package defpackage;

/* renamed from: hyc reason: default package */
public final class hyc {
    private final hxz a;
    private final iga b;
    private final spi c;
    private hyd d;
    private boolean e;
    private final ifv f;

    public hyc(hxz hxz, iga iga, spi spi, ifw ifw) {
        this.a = hxz;
        this.b = iga;
        this.c = spi;
        this.f = ifw.a(this.a.b());
    }

    public final void a(hyd hyd) {
        this.d = hyd;
        this.d.a(this.f);
        this.d.b(this.a.b());
        this.d.a_(this.a.c());
        this.d.c(this.a.d());
    }

    public final void a() {
        this.c.a(this.a.e());
        this.b.a("clicked", this.a.a());
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
