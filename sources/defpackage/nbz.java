package defpackage;

/* renamed from: nbz reason: default package */
public final class nbz implements vua<ncb> {
    private final wlc<nbm> a;
    private final wlc<nbs> b;
    private final wlc<wug> c;

    private nbz(wlc<nbm> wlc, wlc<nbs> wlc2, wlc<wug> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nbz a(wlc<nbm> wlc, wlc<nbs> wlc2, wlc<wug> wlc3) {
        return new nbz(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (ncb) vuf.a(CC.a((nbm) this.a.get(), (nbs) this.b.get(), (wug) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
