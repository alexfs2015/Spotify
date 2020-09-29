package defpackage;

/* renamed from: mcd reason: default package */
public final class mcd {
    final lbg a;
    final mcn b;
    final mct c;

    private mcd(lbg lbg, mcn mcn, mct mct) {
        this.a = (lbg) fbp.a(lbg);
        this.b = (mcn) fbp.a(mcn);
        this.c = (mct) fbp.a(mct);
    }

    public static mcd a(lbg lbg, mcn mcn, mct mct) {
        return new mcd(lbg, mcn, mct);
    }
}
