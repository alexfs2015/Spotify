package defpackage;

/* renamed from: obq reason: default package */
public final class obq implements wig<c<oca, oby, obx>> {
    private final wzi<ocb> a;
    private final wzi<ocd> b;

    private obq(wzi<ocb> wzi, wzi<ocd> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static obq a(wzi<ocb> wzi, wzi<ocd> wzi2) {
        return new obq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (c) wil.a(CC.a((ocb) this.a.get(), (ocd) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
