package defpackage;

/* renamed from: mxp reason: default package */
public final class mxp implements wig<mxo> {
    private final wzi<gwp> a;
    private final wzi<gwr> b;
    private final wzi<mxn> c;
    private final wzi<gwm> d;

    private mxp(wzi<gwp> wzi, wzi<gwr> wzi2, wzi<mxn> wzi3, wzi<gwm> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mxp a(wzi<gwp> wzi, wzi<gwr> wzi2, wzi<mxn> wzi3, wzi<gwm> wzi4) {
        return new mxp(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mxo((gwp) this.a.get(), (gwr) this.b.get(), (mxn) this.c.get(), (gwm) this.d.get());
    }
}
