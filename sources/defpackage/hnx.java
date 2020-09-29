package defpackage;

/* renamed from: hnx reason: default package */
public final class hnx implements wig<waq> {
    private final wzi<kf> a;
    private final wzi<bso> b;
    private final wzi<gbp> c;

    private hnx(wzi<kf> wzi, wzi<bso> wzi2, wzi<gbp> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hnx a(wzi<kf> wzi, wzi<bso> wzi2, wzi<gbp> wzi3) {
        return new hnx(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (waq) wil.a(new waq((kf) this.a.get(), (bso) this.b.get(), (gbp) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
