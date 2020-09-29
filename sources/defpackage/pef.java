package defpackage;

/* renamed from: pef reason: default package */
public final class pef {
    private final pej a;
    private final pes b;
    private final pel c;
    private final pez d;
    private final pfa e;
    private final jrp f;

    public pef(pej pej, pes pes, pel pel, pez pez, pfa pfa, jrp jrp) {
        this.a = pej;
        this.b = pes;
        this.c = pel;
        this.d = pez;
        this.e = pfa;
        this.f = jrp;
        if (this.e.c.a(pfa.b, -1) == -1) {
            this.e.c.a().a(pfa.b, this.f.a()).b();
            b();
        }
    }

    public final void a() {
        if (this.e.a()) {
            this.e.c.a().a(pfa.a, false).b();
            pej pej = this.a;
            pej.a.cancel(pej.b());
        }
    }

    public void b() {
        if (this.b.a()) {
            if (this.d.b()) {
                this.c.a();
                b();
                return;
            }
            this.a.a();
        }
    }
}
