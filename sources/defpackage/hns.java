package defpackage;

/* renamed from: hns reason: default package */
public final class hns implements vua<hst> {
    private final wlc<hip> a;
    private final wlc<wug> b;

    private hns(wlc<hip> wlc, wlc<wug> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hns a(wlc<hip> wlc, wlc<wug> wlc2) {
        return new hns(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (hst) vuf.a(new hss((hip) this.a.get(), (wug) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
