package defpackage;

/* renamed from: ojn reason: default package */
public final class ojn implements vua<ouw> {
    private final wlc<oux> a;
    private final wlc<oeu> b;

    private ojn(wlc<oux> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ojn a(wlc<oux> wlc, wlc<oeu> wlc2) {
        return new ojn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ouw) vuf.a(((oux) this.a.get()).a(((oeu) this.b.get()).c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
