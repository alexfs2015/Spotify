package defpackage;

/* renamed from: vel reason: default package */
public final class vel implements vua<vej> {
    private final wlc<vgw> a;

    private vel(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vel a(wlc<vgw> wlc) {
        return new vel(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vej) vuf.a(vek.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
