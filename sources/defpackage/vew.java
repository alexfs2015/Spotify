package defpackage;

/* renamed from: vew reason: default package */
public final class vew implements vua<veu> {
    private final wlc<vgw> a;

    private vew(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vew a(wlc<vgw> wlc) {
        return new vew(wlc);
    }

    public final /* synthetic */ Object get() {
        return (veu) vuf.a(vev.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
