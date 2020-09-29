package defpackage;

/* renamed from: pwi reason: default package */
public final class pwi implements vua<pwh> {
    private final wlc<sfk> a;
    private final wlc<sgn> b;

    private pwi(wlc<sfk> wlc, wlc<sgn> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pwi a(wlc<sfk> wlc, wlc<sgn> wlc2) {
        return new pwi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pwh((sfk) this.a.get(), (sgn) this.b.get());
    }
}
