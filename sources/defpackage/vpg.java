package defpackage;

/* renamed from: vpg reason: default package */
public final class vpg implements vua<vqp> {
    private final wlc<gdz<fko>> a;

    private vpg(wlc<gdz<fko>> wlc) {
        this.a = wlc;
    }

    public static vpg a(wlc<gdz<fko>> wlc) {
        return new vpg(wlc);
    }

    public static vqp a(gdz<fko> gdz) {
        return (vqp) vuf.a(CC.a(gdz), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((gdz) this.a.get());
    }
}
