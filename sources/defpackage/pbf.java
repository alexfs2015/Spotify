package defpackage;

/* renamed from: pbf reason: default package */
public final class pbf implements vua<tmr> {
    private final wlc<fpt> a;
    private final wlc<rxj> b;

    private pbf(wlc<fpt> wlc, wlc<rxj> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pbf a(wlc<fpt> wlc, wlc<rxj> wlc2) {
        return new pbf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        fpt fpt = (fpt) this.a.get();
        tmr tmr = new tmr((rxj) this.b.get());
        tmr.a = fpt.b(rxd.a);
        return (tmr) vuf.a(tmr, "Cannot return null from a non-@Nullable @Provides method");
    }
}
