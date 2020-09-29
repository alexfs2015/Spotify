package defpackage;

/* renamed from: mdd reason: default package */
public final class mdd implements wig<mdc> {
    private final wzi<a> a;
    private final wzi<mcf> b;

    private mdd(wzi<a> wzi, wzi<mcf> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mdd a(wzi<a> wzi, wzi<mcf> wzi2) {
        return new mdd(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new mdc((a) this.a.get(), (mcf) this.b.get());
    }
}
