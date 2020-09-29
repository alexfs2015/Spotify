package defpackage;

/* renamed from: nqf reason: default package */
public final class nqf implements wig<pch> {
    private final wzi<pci> a;
    private final wzi<gkq> b;

    private nqf(wzi<pci> wzi, wzi<gkq> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nqf a(wzi<pci> wzi, wzi<gkq> wzi2) {
        return new nqf(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (pch) wil.a(((pci) this.a.get()).a((gkq) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
