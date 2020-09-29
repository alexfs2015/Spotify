package defpackage;

/* renamed from: ojj reason: default package */
public final class ojj implements vua<ome> {
    private final wlc<omf> a;
    private final wlc<oeu> b;

    private ojj(wlc<omf> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ojj a(wlc<omf> wlc, wlc<oeu> wlc2) {
        return new ojj(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ome) vuf.a(new omh((opb) omf.a(((omf) this.a.get()).a.get(), 1), (gjf) omf.a(((oeu) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
