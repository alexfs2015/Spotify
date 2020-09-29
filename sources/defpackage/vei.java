package defpackage;

/* renamed from: vei reason: default package */
public final class vei implements vua<veg> {
    private final wlc<vgw> a;

    private vei(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vei a(wlc<vgw> wlc) {
        return new vei(wlc);
    }

    public final /* synthetic */ Object get() {
        return (veg) vuf.a(veh.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
