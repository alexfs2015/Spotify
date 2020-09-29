package defpackage;

/* renamed from: vfd reason: default package */
public final class vfd implements vua<vfb> {
    private final wlc<vgw> a;

    private vfd(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vfd a(wlc<vgw> wlc) {
        return new vfd(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vfb) vuf.a(vfc.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
