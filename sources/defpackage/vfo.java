package defpackage;

/* renamed from: vfo reason: default package */
public final class vfo implements vua<vfm> {
    private final wlc<vgw> a;

    private vfo(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vfo a(wlc<vgw> wlc) {
        return new vfo(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vfm) vuf.a(vfn.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
