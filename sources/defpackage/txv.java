package defpackage;

/* renamed from: txv reason: default package */
public final class txv implements vua<txu> {
    private final wlc<fpt> a;
    private final wlc<snx> b;

    private txv(wlc<fpt> wlc, wlc<snx> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static txv a(wlc<fpt> wlc, wlc<snx> wlc2) {
        return new txv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new txu((fpt) this.a.get(), (snx) this.b.get());
    }
}
