package defpackage;

/* renamed from: nho reason: default package */
public final class nho implements wig<nhq> {
    private final wzi<nhb> a;
    private final wzi<nhh> b;
    private final wzi<xil> c;

    private nho(wzi<nhb> wzi, wzi<nhh> wzi2, wzi<xil> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static nho a(wzi<nhb> wzi, wzi<nhh> wzi2, wzi<xil> wzi3) {
        return new nho(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (nhq) wil.a(CC.a((nhb) this.a.get(), (nhh) this.b.get(), (xil) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
