package defpackage;

/* renamed from: nhp reason: default package */
public final class nhp implements wig<nhh> {
    private final wzi<gwp> a;
    private final wzi<gwr> b;

    private nhp(wzi<gwp> wzi, wzi<gwr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nhp a(wzi<gwp> wzi, wzi<gwr> wzi2) {
        return new nhp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (nhh) wil.a(CC.a((gwp) this.a.get(), (gwr) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
