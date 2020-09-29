package defpackage;

/* renamed from: nkj reason: default package */
public final class nkj implements vua<oqu> {
    private final wlc<oqv> a;
    private final wlc<gjf> b;

    private nkj(wlc<oqv> wlc, wlc<gjf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nkj a(wlc<oqv> wlc, wlc<gjf> wlc2) {
        return new nkj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (oqu) vuf.a(((oqv) this.a.get()).a((gjf) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
