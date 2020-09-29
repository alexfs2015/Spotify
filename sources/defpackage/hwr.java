package defpackage;

/* renamed from: hwr reason: default package */
public final class hwr implements vua<hxl> {
    private final wlc<rnf> a;
    private final wlc<gkz> b;

    private hwr(wlc<rnf> wlc, wlc<gkz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hwr a(wlc<rnf> wlc, wlc<gkz> wlc2) {
        return new hwr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (hxl) vuf.a(CC.a((rnf) this.a.get(), (gkz) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
