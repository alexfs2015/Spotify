package defpackage;

/* renamed from: ghy reason: default package */
public final class ghy implements vua<ghm> {
    private final wlc<gho> a;
    private final wlc<rnf> b;

    private ghy(wlc<gho> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ghy a(wlc<gho> wlc, wlc<rnf> wlc2) {
        return new ghy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (ghm) vuf.a(CC.a((gho) this.a.get(), (rnf) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
