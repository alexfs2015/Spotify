package defpackage;

/* renamed from: tcf reason: default package */
public final class tcf implements wig<tce> {
    private final wzi<tdl> a;
    private final wzi<tdd> b;
    private final wzi<tmc> c;
    private final wzi<tcc> d;
    private final wzi<tdh> e;

    private tcf(wzi<tdl> wzi, wzi<tdd> wzi2, wzi<tmc> wzi3, wzi<tcc> wzi4, wzi<tdh> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static tcf a(wzi<tdl> wzi, wzi<tdd> wzi2, wzi<tmc> wzi3, wzi<tcc> wzi4, wzi<tdh> wzi5) {
        tcf tcf = new tcf(wzi, wzi2, wzi3, wzi4, wzi5);
        return tcf;
    }

    public final /* synthetic */ Object get() {
        tce tce = new tce((tdl) this.a.get(), (tdd) this.b.get(), (tmc) this.c.get(), (tcc) this.d.get(), (tdh) this.e.get());
        return tce;
    }
}
