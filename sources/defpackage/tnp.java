package defpackage;

/* renamed from: tnp reason: default package */
public final class tnp implements vua<tun> {
    private final wlc<tuo> a;
    private final wlc<koz> b;

    private tnp(wlc<tuo> wlc, wlc<koz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tnp a(wlc<tuo> wlc, wlc<koz> wlc2) {
        return new tnp(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        tuo tuo = (tuo) this.a.get();
        tuo.a(a.class, (tum) (koz) this.b.get());
        return (tun) vuf.a(tuo, "Cannot return null from a non-@Nullable @Provides method");
    }
}
