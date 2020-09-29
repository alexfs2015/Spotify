package defpackage;

/* renamed from: iyk reason: default package */
public final class iyk implements vua<iya> {
    private final wlc<iyg> a;

    private iyk(wlc<iyg> wlc) {
        this.a = wlc;
    }

    public static iyk a(wlc<iyg> wlc) {
        return new iyk(wlc);
    }

    public static iya a(iyg iyg) {
        return (iya) vuf.a(iyg, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((iyg) this.a.get());
    }
}
