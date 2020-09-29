package defpackage;

/* renamed from: mbm reason: default package */
public final class mbm implements wig<rof> {
    private final wzi<vlp> a;
    private final wzi<Boolean> b;
    private final wzi<Boolean> c;
    private final wzi<xii<Boolean>> d;

    private mbm(wzi<vlp> wzi, wzi<Boolean> wzi2, wzi<Boolean> wzi3, wzi<xii<Boolean>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mbm a(wzi<vlp> wzi, wzi<Boolean> wzi2, wzi<Boolean> wzi3, wzi<xii<Boolean>> wzi4) {
        return new mbm(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (rof) wil.a((!((Boolean) this.b.get()).booleanValue() || !((Boolean) this.c.get()).booleanValue()) ? new roe() : new rod((vlp) this.a.get(), (xii) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
