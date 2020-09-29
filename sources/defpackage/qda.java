package defpackage;

/* renamed from: qda reason: default package */
public final class qda implements wig<qdl> {
    private final wzi<gwp> a;
    private final wzi<gwr> b;

    private qda(wzi<gwp> wzi, wzi<gwr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qda a(wzi<gwp> wzi, wzi<gwr> wzi2) {
        return new qda(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (qdl) wil.a(new qdm((gwp) this.a.get(), (gwr) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
