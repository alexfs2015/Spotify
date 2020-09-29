package defpackage;

/* renamed from: nbr reason: default package */
public final class nbr implements wig<nbq> {
    private final wzi<ipf> a;
    private final wzi<nbu> b;

    private nbr(wzi<ipf> wzi, wzi<nbu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nbr a(wzi<ipf> wzi, wzi<nbu> wzi2) {
        return new nbr(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nbq(this.a, this.b);
    }
}
