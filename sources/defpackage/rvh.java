package defpackage;

/* renamed from: rvh reason: default package */
public final class rvh implements vua<rvg> {
    private final wlc<rvi> a;
    private final wlc<nuv> b;

    private rvh(wlc<rvi> wlc, wlc<nuv> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rvh a(wlc<rvi> wlc, wlc<nuv> wlc2) {
        return new rvh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rvg((rvi) this.a.get(), (nuv) this.b.get());
    }
}
