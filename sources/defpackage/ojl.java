package defpackage;

/* renamed from: ojl reason: default package */
public final class ojl implements vua<olo> {
    private final wlc<olp> a;
    private final wlc<oeu> b;

    private ojl(wlc<olp> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ojl a(wlc<olp> wlc, wlc<oeu> wlc2) {
        return new ojl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (olo) vuf.a(((olp) this.a.get()).a(((oeu) this.b.get()).c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
