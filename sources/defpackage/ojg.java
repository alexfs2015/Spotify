package defpackage;

/* renamed from: ojg reason: default package */
public final class ojg implements vua<okh> {
    private final wlc<oki> a;
    private final wlc<oeu> b;

    private ojg(wlc<oki> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ojg a(wlc<oki> wlc, wlc<oeu> wlc2) {
        return new ojg(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (okh) vuf.a(new okk((opb) oki.a(((oki) this.a.get()).a.get(), 1), (gjf) oki.a(((oeu) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
