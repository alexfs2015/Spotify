package defpackage;

/* renamed from: ojm reason: default package */
public final class ojm implements vua<omt> {
    private final wlc<omu> a;
    private final wlc<oeu> b;

    private ojm(wlc<omu> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ojm a(wlc<omu> wlc, wlc<oeu> wlc2) {
        return new ojm(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (omt) vuf.a(new omw((opb) omu.a(((omu) this.a.get()).a.get(), 1), (gjf) omu.a(((oeu) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
