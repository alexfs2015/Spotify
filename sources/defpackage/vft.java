package defpackage;

/* renamed from: vft reason: default package */
public final class vft implements vua<vfr> {
    private final wlc<vgw> a;

    private vft(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vft a(wlc<vgw> wlc) {
        return new vft(wlc);
    }

    public static vfr a(vgw vgw) {
        return (vfr) vuf.a(vfs.a(vgw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((vgw) this.a.get());
    }
}
