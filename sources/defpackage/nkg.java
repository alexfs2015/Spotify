package defpackage;

/* renamed from: nkg reason: default package */
public final class nkg implements wig<nkf> {
    private final wzi<fqn> a;
    private final wzi<hgb> b;
    private final wzi<tvn> c;

    private nkg(wzi<fqn> wzi, wzi<hgb> wzi2, wzi<tvn> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static nkf a(fqn fqn, hgb hgb, tvn tvn) {
        return new nkf(fqn, hgb, tvn);
    }

    public static nkg a(wzi<fqn> wzi, wzi<hgb> wzi2, wzi<tvn> wzi3) {
        return new nkg(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new nkf((fqn) this.a.get(), (hgb) this.b.get(), (tvn) this.c.get());
    }
}
