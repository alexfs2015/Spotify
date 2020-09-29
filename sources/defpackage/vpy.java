package defpackage;

/* renamed from: vpy reason: default package */
public final class vpy implements wig<vpx> {
    private final wzi<vqg> a;
    private final wzi<jty> b;

    private vpy(wzi<vqg> wzi, wzi<jty> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vpy a(wzi<vqg> wzi, wzi<jty> wzi2) {
        return new vpy(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new vpx((vqg) this.a.get(), (jty) this.b.get());
    }
}
