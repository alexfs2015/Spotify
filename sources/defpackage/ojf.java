package defpackage;

/* renamed from: ojf reason: default package */
public final class ojf implements vua<ojs> {
    private final wlc<ojt> a;
    private final wlc<oeu> b;

    private ojf(wlc<ojt> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ojf a(wlc<ojt> wlc, wlc<oeu> wlc2) {
        return new ojf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ojs) vuf.a(new ojv((opb) ojt.a(((ojt) this.a.get()).a.get(), 1), (gjf) ojt.a(((oeu) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
