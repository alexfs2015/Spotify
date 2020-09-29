package defpackage;

/* renamed from: plr reason: default package */
public final class plr {
    private final plv a;
    private final pme b;
    private final plx c;
    private final pml d;
    private final pmm e;
    private final jtz f;

    public plr(plv plv, pme pme, plx plx, pml pml, pmm pmm, jtz jtz) {
        this.a = plv;
        this.b = pme;
        this.c = plx;
        this.d = pml;
        this.e = pmm;
        this.f = jtz;
        if (this.e.c.a(pmm.b, -1) == -1) {
            this.e.c.a().a(pmm.b, this.f.a()).b();
            b();
        }
    }

    public final void a() {
        if (this.e.a()) {
            this.e.c.a().a(pmm.a, false).b();
            plv plv = this.a;
            plv.a.cancel(plv.b());
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
