package defpackage;

/* renamed from: svo reason: default package */
public final class svo implements vua<uom> {
    private final wlc<unx> a;
    private final wlc<uoe> b;

    private svo(wlc<unx> wlc, wlc<uoe> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static svo a(wlc<unx> wlc, wlc<uoe> wlc2) {
        return new svo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (uom) vuf.a(new uom((unx) this.a.get(), (uoe) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
