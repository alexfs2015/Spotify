package defpackage;

/* renamed from: ojd reason: default package */
public final class ojd implements vua<ofn> {
    private final wlc<ofo> a;
    private final wlc<oeu> b;

    private ojd(wlc<ofo> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ojd a(wlc<ofo> wlc, wlc<oeu> wlc2) {
        return new ojd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ofn) vuf.a(new ofq((opb) ofo.a(((ofo) this.a.get()).a.get(), 1), (gjf) ofo.a(((oeu) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
