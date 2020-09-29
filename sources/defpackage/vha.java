package defpackage;

/* renamed from: vha reason: default package */
public final class vha implements vua<vgy> {
    private final wlc<vgw> a;

    private vha(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vha a(wlc<vgw> wlc) {
        return new vha(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vgy) vuf.a(vgz.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
