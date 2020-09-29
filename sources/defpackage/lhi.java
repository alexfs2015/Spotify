package defpackage;

/* renamed from: lhi reason: default package */
public final class lhi implements wig<hvh> {
    private final wzi<gtb> a;
    private final wzi<xil> b;

    private lhi(wzi<gtb> wzi, wzi<xil> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lhi a(wzi<gtb> wzi, wzi<xil> wzi2) {
        return new lhi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (hvh) wil.a(new hvg((gtb) this.a.get(), (xil) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
