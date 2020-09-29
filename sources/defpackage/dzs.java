package defpackage;

/* renamed from: dzs reason: default package */
final class dzs {
    bir a;
    dpp b;
    dyl c;
    long d;
    boolean e;
    boolean f;
    private final /* synthetic */ dzr g;

    dzs(dzr dzr, dyk dyk) {
        this.g = dzr;
        bir bir = new bir(dyk.a.getApplicationContext(), new dpt(), dzr.c, dyk.b, dyk.c, dyk.d);
        this.a = bir;
        this.c = new dyl();
        dyl dyl = this.c;
        bir bir2 = this.a;
        bir2.a((dqj) new dym(dyl));
        bir2.a((drd) new dyv(dyl));
        bir2.a((dty) new dyx(dyl));
        bir2.a((dqg) new dyz(dyl));
        bir2.a((cjn) new dzb(dyl));
    }

    dzs(dzr dzr, dyk dyk, dpp dpp) {
        this(dzr, dyk);
        this.b = dpp;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        if (this.e) {
            return false;
        }
        dpp dpp = this.b;
        if (dpp == null) {
            dpp = this.g.b;
        }
        this.f = this.a.b(dzp.b(dpp));
        this.e = true;
        this.d = bkc.l().a();
        return true;
    }
}
