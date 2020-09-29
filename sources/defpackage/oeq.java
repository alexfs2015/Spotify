package defpackage;

/* renamed from: oeq reason: default package */
public final class oeq implements vua<oep> {
    private final wlc<oen> a;
    private final wlc<a> b;
    private final wlc<oer> c;

    private oeq(wlc<oen> wlc, wlc<a> wlc2, wlc<oer> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static oeq a(wlc<oen> wlc, wlc<a> wlc2, wlc<oer> wlc3) {
        return new oeq(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new oep((oen) this.a.get(), (a) this.b.get(), (oer) this.c.get());
    }
}
