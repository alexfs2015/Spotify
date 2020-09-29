package defpackage;

/* renamed from: vsd reason: default package */
public final class vsd implements wig<vsb> {
    private final wzi<vub> a;

    private vsd(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vsd a(wzi<vub> wzi) {
        return new vsd(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vsb) wil.a(vsc.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
