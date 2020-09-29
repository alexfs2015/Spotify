package defpackage;

/* renamed from: vso reason: default package */
public final class vso implements wig<vsm> {
    private final wzi<vub> a;

    private vso(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vso a(wzi<vub> wzi) {
        return new vso(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vsm) wil.a(vsn.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
