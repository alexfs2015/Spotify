package defpackage;

/* renamed from: ojh reason: default package */
public final class ojh implements vua<rbr> {
    private final wlc<olc> a;
    private final wlc<oeu> b;

    private ojh(wlc<olc> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ojh a(wlc<olc> wlc, wlc<oeu> wlc2) {
        return new ojh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (rbr) vuf.a(new ole((opb) olc.a(((olc) this.a.get()).a.get(), 1), (gjf) olc.a(((oeu) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
