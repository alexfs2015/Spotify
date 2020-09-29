package defpackage;

/* renamed from: nca reason: default package */
public final class nca implements vua<nbs> {
    private final wlc<gup> a;
    private final wlc<gur> b;

    private nca(wlc<gup> wlc, wlc<gur> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nca a(wlc<gup> wlc, wlc<gur> wlc2) {
        return new nca(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (nbs) vuf.a(CC.a((gup) this.a.get(), (gur) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
