package defpackage;

/* renamed from: vrt reason: default package */
public final class vrt implements wig<vrr> {
    private final wzi<vub> a;

    private vrt(wzi<vub> wzi) {
        this.a = wzi;
    }

    public static vrt a(wzi<vub> wzi) {
        return new vrt(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vrr) wil.a(vrs.a((vub) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
