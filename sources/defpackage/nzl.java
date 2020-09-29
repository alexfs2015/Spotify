package defpackage;

/* renamed from: nzl reason: default package */
public final class nzl implements wig<nzt> {
    private final wzi<gwp> a;
    private final wzi<gwr> b;

    private nzl(wzi<gwp> wzi, wzi<gwr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nzl a(wzi<gwp> wzi, wzi<gwr> wzi2) {
        return new nzl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (nzt) wil.a(new nzt((gwp) this.a.get(), (gwr) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
