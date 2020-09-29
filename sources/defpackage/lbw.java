package defpackage;

/* renamed from: lbw reason: default package */
public final class lbw implements vua<wsk> {
    private final wlc<gho> a;
    private final wlc<rnf> b;

    private lbw(wlc<gho> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lbw a(wlc<gho> wlc, wlc<rnf> wlc2) {
        return new lbw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (wsk) vuf.a(ghn.a(((gho) this.a.get()).b, (rnf) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
