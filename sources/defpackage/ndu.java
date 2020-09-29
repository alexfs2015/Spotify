package defpackage;

/* renamed from: ndu reason: default package */
public final class ndu implements vua<ndt> {
    private final wlc<rnd> a;
    private final wlc<Boolean> b;

    private ndu(wlc<rnd> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ndu a(wlc<rnd> wlc, wlc<Boolean> wlc2) {
        return new ndu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ndt((rnd) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
