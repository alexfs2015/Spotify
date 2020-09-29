package defpackage;

/* renamed from: vec reason: default package */
public final class vec implements vua<vea> {
    private final wlc<vgw> a;

    private vec(wlc<vgw> wlc) {
        this.a = wlc;
    }

    public static vec a(wlc<vgw> wlc) {
        return new vec(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vea) vuf.a(veb.a((vgw) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
