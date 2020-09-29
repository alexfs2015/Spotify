package defpackage;

/* renamed from: omi reason: default package */
public final class omi implements wig<omh> {
    private final wzi<ozl> a;
    private final wzi<hfx> b;
    private final wzi<rqb> c;
    private final wzi<ozm> d;
    private final wzi<tvn> e;
    private final wzi<vre> f;

    private omi(wzi<ozl> wzi, wzi<hfx> wzi2, wzi<rqb> wzi3, wzi<ozm> wzi4, wzi<tvn> wzi5, wzi<vre> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static omi a(wzi<ozl> wzi, wzi<hfx> wzi2, wzi<rqb> wzi3, wzi<ozm> wzi4, wzi<tvn> wzi5, wzi<vre> wzi6) {
        omi omi = new omi(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return omi;
    }

    public final /* synthetic */ Object get() {
        omh omh = new omh((ozl) this.a.get(), (hfx) this.b.get(), (rqb) this.c.get(), (ozm) this.d.get(), (tvn) this.e.get(), (vre) this.f.get());
        return omh;
    }
}
