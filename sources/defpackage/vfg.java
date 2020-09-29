package defpackage;

/* renamed from: vfg reason: default package */
public final class vfg implements vua<vfe> {
    private final wlc<vgw> a;

    private vfg(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vfg a(wlc<vgw> wlc) {
        return new vfg(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vfe) vuf.a(vff.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
