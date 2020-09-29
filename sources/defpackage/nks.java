package defpackage;

/* renamed from: nks reason: default package */
public final class nks implements vua<oiw> {
    private final wlc<a> a;
    private final wlc<oib> b;

    private nks(wlc<a> wlc, wlc<oib> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nks a(wlc<a> wlc, wlc<oib> wlc2) {
        return new nks(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (oiw) vuf.a(((a) this.a.get()).a(((oib) this.b.get()).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
