package defpackage;

/* renamed from: ojk reason: default package */
public final class ojk implements vua<oqe> {
    private final wlc<oqf> a;
    private final wlc<oeu> b;

    private ojk(wlc<oqf> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ojk a(wlc<oqf> wlc, wlc<oeu> wlc2) {
        return new ojk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (oqe) vuf.a(new oqh((opb) oqf.a(((oqf) this.a.get()).a.get(), 1), (gjf) oqf.a(((oeu) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
