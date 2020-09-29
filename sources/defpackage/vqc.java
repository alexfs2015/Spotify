package defpackage;

/* renamed from: vqc reason: default package */
public final class vqc implements wig<vqg> {
    private final wzi<gix> a;

    private vqc(wzi<gix> wzi) {
        this.a = wzi;
    }

    public static vqc a(wzi<gix> wzi) {
        return new vqc(wzi);
    }

    public static vqg a(gix gix) {
        return (vqg) wil.a(CC.a(gix), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((gix) this.a.get());
    }
}
