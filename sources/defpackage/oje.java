package defpackage;

/* renamed from: oje reason: default package */
public final class oje implements vua<oqu> {
    private final wlc<oqv> a;
    private final wlc<oeu> b;

    private oje(wlc<oqv> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oje a(wlc<oqv> wlc, wlc<oeu> wlc2) {
        return new oje(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (oqu) vuf.a(((oqv) this.a.get()).a(((oeu) this.b.get()).c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
