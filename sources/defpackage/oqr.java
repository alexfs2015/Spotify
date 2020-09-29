package defpackage;

/* renamed from: oqr reason: default package */
public final class oqr implements wig<pch> {
    private final wzi<pci> a;
    private final wzi<oma> b;

    private oqr(wzi<pci> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oqr a(wzi<pci> wzi, wzi<oma> wzi2) {
        return new oqr(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (pch) wil.a(((pci) this.a.get()).a(((oma) this.b.get()).c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
