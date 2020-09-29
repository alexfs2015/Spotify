package defpackage;

/* renamed from: mpf reason: default package */
public final class mpf implements wig<gwp> {
    private final wzi<gwm> a;
    private final wzi<gwr> b;

    private mpf(wzi<gwm> wzi, wzi<gwr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mpf a(wzi<gwm> wzi, wzi<gwr> wzi2) {
        return new mpf(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gwp) wil.a(new gwp((gwm) this.a.get(), (gwr) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
