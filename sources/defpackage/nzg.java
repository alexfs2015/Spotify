package defpackage;

/* renamed from: nzg reason: default package */
public final class nzg implements wig<gwp> {
    private final wzi<gwm> a;
    private final wzi<gwr> b;

    private nzg(wzi<gwm> wzi, wzi<gwr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nzg a(wzi<gwm> wzi, wzi<gwr> wzi2) {
        return new nzg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gwp) wil.a(new gwp((gwm) this.a.get(), (gwr) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
