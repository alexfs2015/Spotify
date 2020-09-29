package defpackage;

/* renamed from: iyf reason: default package */
public final class iyf implements vua<iya> {
    private final wlc<iyb> a;

    private iyf(wlc<iyb> wlc) {
        this.a = wlc;
    }

    public static iyf a(wlc<iyb> wlc) {
        return new iyf(wlc);
    }

    public static iya a(iyb iyb) {
        return (iya) vuf.a(iyb, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((iyb) this.a.get());
    }
}
