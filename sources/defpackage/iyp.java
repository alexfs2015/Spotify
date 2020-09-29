package defpackage;

/* renamed from: iyp reason: default package */
public final class iyp implements vua<iya> {
    private final wlc<iyl> a;

    private iyp(wlc<iyl> wlc) {
        this.a = wlc;
    }

    public static iyp a(wlc<iyl> wlc) {
        return new iyp(wlc);
    }

    public static iya a(iyl iyl) {
        return (iya) vuf.a(iyl, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((iyl) this.a.get());
    }
}
