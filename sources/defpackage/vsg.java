package defpackage;

/* renamed from: vsg reason: default package */
public final class vsg implements wig<vse> {
    private final wzi<vub> a;

    private vsg(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vsg a(wzi<vub> wzi) {
        return new vsg(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vse) wil.a(vsf.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
