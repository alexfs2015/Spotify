package defpackage;

/* renamed from: mkk reason: default package */
public final class mkk implements vua<mkp> {
    private final wlc<gup> a;
    private final wlc<gur> b;

    private mkk(wlc<gup> wlc, wlc<gur> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mkk a(wlc<gup> wlc, wlc<gur> wlc2) {
        return new mkk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (mkp) vuf.a(new mkq((gup) this.a.get(), (gur) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
