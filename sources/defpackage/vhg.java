package defpackage;

/* renamed from: vhg reason: default package */
public final class vhg implements vua<vhe> {
    private final wlc<vgw> a;

    private vhg(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vhg a(wlc<vgw> wlc) {
        return new vhg(wlc);
    }

    public static vhe a(vgw vgw) {
        return (vhe) vuf.a(vhf.a(vgw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((vgw) this.a.get());
    }
}
