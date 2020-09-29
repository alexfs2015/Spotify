package defpackage;

/* renamed from: qhi reason: default package */
public final class qhi implements wig<spu> {
    private final wzi<Boolean> a;
    private final wzi<spx> b;
    private final wzi<spz> c;

    private qhi(wzi<Boolean> wzi, wzi<spx> wzi2, wzi<spz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qhi a(wzi<Boolean> wzi, wzi<spx> wzi2, wzi<spz> wzi3) {
        return new qhi(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (spu) wil.a(((Boolean) this.a.get()).booleanValue() ? (spu) this.c.get() : (spu) this.b.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
