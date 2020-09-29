package defpackage;

/* renamed from: vrd reason: default package */
public final class vrd implements wig<vrb> {
    private final wzi<vub> a;

    private vrd(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vrd a(wzi<vub> wzi) {
        return new vrd(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vrb) wil.a(vrc.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
