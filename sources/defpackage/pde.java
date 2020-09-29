package defpackage;

/* renamed from: pde reason: default package */
public final class pde implements wig<pdd> {
    private final wzi<pdi> a;
    private final wzi<pdg> b;
    private final wzi<a> c;
    private final wzi<b> d;
    private final wzi<pdm> e;
    private final wzi<vse> f;
    private final wzi<a> g;

    private pde(wzi<pdi> wzi, wzi<pdg> wzi2, wzi<a> wzi3, wzi<b> wzi4, wzi<pdm> wzi5, wzi<vse> wzi6, wzi<a> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static pde a(wzi<pdi> wzi, wzi<pdg> wzi2, wzi<a> wzi3, wzi<b> wzi4, wzi<pdm> wzi5, wzi<vse> wzi6, wzi<a> wzi7) {
        pde pde = new pde(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return pde;
    }

    public final /* synthetic */ Object get() {
        pdd pdd = new pdd((pdi) this.a.get(), (pdg) this.b.get(), (a) this.c.get(), (b) this.d.get(), (pdm) this.e.get(), (vse) this.f.get(), (a) this.g.get());
        return pdd;
    }
}
