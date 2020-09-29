package defpackage;

/* renamed from: ljc reason: default package */
public final class ljc implements vua<vjt> {
    private final wlc<swe> a;

    private ljc(wlc<swe> wlc) {
        this.a = wlc;
    }

    public static ljc a(wlc<swe> wlc) {
        return new ljc(wlc);
    }

    public static vjt a(swe swe) {
        return (vjt) vuf.a(CC.a(swe), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((swe) this.a.get());
    }
}
