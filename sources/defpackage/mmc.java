package defpackage;

/* renamed from: mmc reason: default package */
public final class mmc implements vua<mmb> {
    private final wlc<rqd> a;
    private final wlc<jug> b;

    private mmc(wlc<rqd> wlc, wlc<jug> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mmc a(wlc<rqd> wlc, wlc<jug> wlc2) {
        return new mmc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mmb((rqd) this.a.get(), (jug) this.b.get());
    }
}
