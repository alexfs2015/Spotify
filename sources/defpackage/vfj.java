package defpackage;

/* renamed from: vfj reason: default package */
public final class vfj implements vua<vfh> {
    private final wlc<vgw> a;

    private vfj(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vfj a(wlc<vgw> wlc) {
        return new vfj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vfh) vuf.a(vfi.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
