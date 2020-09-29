package defpackage;

/* renamed from: vxx reason: default package */
public final class vxx implements wig<vxe> {
    private final wzi<waq> a;
    private final wzi<vxw> b;

    private vxx(wzi<waq> wzi, wzi<vxw> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static vxx a(wzi<waq> wzi, wzi<vxw> wzi2) {
        return new vxx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        vxw vxw = (vxw) this.b.get();
        return (vxe) wil.a(new vxe((waq) this.a.get(), new waj()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
