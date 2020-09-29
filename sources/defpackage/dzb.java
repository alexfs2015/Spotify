package defpackage;

/* renamed from: dzb reason: default package */
final class dzb {
    bia a;
    doy b;
    dxu c;
    long d;
    boolean e;
    boolean f;
    private final /* synthetic */ dza g;

    dzb(dza dza, dxt dxt, doy doy) {
        this(dza, dxt);
        this.b = doy;
    }

    dzb(dza dza, dxt dxt) {
        this.g = dza;
        bia bia = new bia(dxt.a.getApplicationContext(), new dpc(), dza.c, dxt.b, dxt.c, dxt.d);
        this.a = bia;
        this.c = new dxu();
        dxu dxu = this.c;
        bia bia2 = this.a;
        bia2.a((dps) new dxv(dxu));
        bia2.a((dqm) new dye(dxu));
        bia2.a((dth) new dyg(dxu));
        bia2.a((dpp) new dyi(dxu));
        bia2.a((ciw) new dyk(dxu));
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        if (this.e) {
            return false;
        }
        doy doy = this.b;
        if (doy == null) {
            doy = this.g.b;
        }
        this.f = this.a.b(dyy.b(doy));
        this.e = true;
        this.d = bjl.l().a();
        return true;
    }
}
