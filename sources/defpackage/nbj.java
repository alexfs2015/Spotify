package defpackage;

/* renamed from: nbj reason: default package */
public final class nbj implements wig<nbi> {
    private final wzi<gwp> a;
    private final wzi<gwr> b;
    private final wzi<nbh> c;
    private final wzi<gwm> d;

    private nbj(wzi<gwp> wzi, wzi<gwr> wzi2, wzi<nbh> wzi3, wzi<gwm> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static nbj a(wzi<gwp> wzi, wzi<gwr> wzi2, wzi<nbh> wzi3, wzi<gwm> wzi4) {
        return new nbj(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new nbi((gwp) this.a.get(), (gwr) this.b.get(), (nbh) this.c.get(), (gwm) this.d.get());
    }
}
