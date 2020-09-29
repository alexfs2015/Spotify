package defpackage;

/* renamed from: qgf reason: default package */
public final class qgf implements wig<spu> {
    private final wzi<Boolean> a;
    private final wzi<spx> b;
    private final wzi<spv> c;

    private qgf(wzi<Boolean> wzi, wzi<spx> wzi2, wzi<spv> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qgf a(wzi<Boolean> wzi, wzi<spx> wzi2, wzi<spv> wzi3) {
        return new qgf(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (spu) wil.a(((Boolean) this.a.get()).booleanValue() ? (spu) this.c.get() : (spu) this.b.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
