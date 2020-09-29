package defpackage;

/* renamed from: rdg reason: default package */
public final class rdg implements wig<rdf> {
    private final wzi<rgf> a;
    private final wzi<rfo> b;

    private rdg(wzi<rgf> wzi, wzi<rfo> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rdg a(wzi<rgf> wzi, wzi<rfo> wzi2) {
        return new rdg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rdf((rgf) this.a.get(), (rfo) this.b.get());
    }
}
