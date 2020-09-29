package defpackage;

/* renamed from: skm reason: default package */
public final class skm implements vua<skr> {
    private final wlc<ghm> a;

    private skm(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static skm a(wlc<ghm> wlc) {
        return new skm(wlc);
    }

    public final /* synthetic */ Object get() {
        return (skr) vuf.a((skr) ((ghm) this.a.get()).a(skr.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
