package defpackage;

/* renamed from: voq reason: default package */
public final class voq implements vua<vol> {
    private final wlc<gdz<fko>> a;

    private voq(wlc<gdz<fko>> wlc) {
        this.a = wlc;
    }

    public static voq a(wlc<gdz<fko>> wlc) {
        return new voq(wlc);
    }

    public static vol a(gdz<fko> gdz) {
        return (vol) vuf.a(CC.a(gdz), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((gdz) this.a.get());
    }
}
