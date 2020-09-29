package defpackage;

/* renamed from: obp reason: default package */
public final class obp implements vua<gme<oas>> {
    private final wlc<glw<oas>> a;
    private final wlc<gmf<oas>> b;
    private final wlc<a> c;

    private obp(wlc<glw<oas>> wlc, wlc<gmf<oas>> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static obp a(wlc<glw<oas>> wlc, wlc<gmf<oas>> wlc2, wlc<a> wlc3) {
        return new obp(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (gme) vuf.a(new gme((glw) this.a.get(), (gmf) this.b.get(), (a) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
