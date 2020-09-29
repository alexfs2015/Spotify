package defpackage;

/* renamed from: pue reason: default package */
public final class pue implements vua<pup> {
    private final wlc<gup> a;
    private final wlc<gur> b;

    private pue(wlc<gup> wlc, wlc<gur> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pue a(wlc<gup> wlc, wlc<gur> wlc2) {
        return new pue(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (pup) vuf.a(new puq((gup) this.a.get(), (gur) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
