package defpackage;

/* renamed from: vef reason: default package */
public final class vef implements vua<ved> {
    private final wlc<vgw> a;

    private vef(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vef a(wlc<vgw> wlc) {
        return new vef(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ved) vuf.a(vee.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
