package defpackage;

/* renamed from: oji reason: default package */
public final class oji implements vua<onm> {
    private final wlc<onn> a;
    private final wlc<oeu> b;

    private oji(wlc<onn> wlc, wlc<oeu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static oji a(wlc<onn> wlc, wlc<oeu> wlc2) {
        return new oji(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (onm) vuf.a(((onn) this.a.get()).a(((oeu) this.b.get()).c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
