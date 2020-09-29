package defpackage;

/* renamed from: nti reason: default package */
public final class nti implements vua<ntq> {
    private final wlc<gup> a;
    private final wlc<gur> b;

    private nti(wlc<gup> wlc, wlc<gur> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nti a(wlc<gup> wlc, wlc<gur> wlc2) {
        return new nti(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ntq) vuf.a(new ntq((gup) this.a.get(), (gur) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
