package defpackage;

/* renamed from: rnz reason: default package */
public final class rnz implements wig<rof> {
    private final wzi<vlp> a;
    private final wzi<rqb> b;
    private final wzi<fqn> c;
    private final wzi<xii<Boolean>> d;

    private rnz(wzi<vlp> wzi, wzi<rqb> wzi2, wzi<fqn> wzi3, wzi<xii<Boolean>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rnz a(wzi<vlp> wzi, wzi<rqb> wzi2, wzi<fqn> wzi3, wzi<xii<Boolean>> wzi4) {
        return new rnz(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (rof) wil.a(((rqb) this.b.get()).a((fqn) this.c.get()) ? new rod((vlp) this.a.get(), (xii) this.d.get()) : new roe(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
