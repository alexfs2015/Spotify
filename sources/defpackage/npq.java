package defpackage;

/* renamed from: npq reason: default package */
public final class npq implements vua<npp> {
    private final wlc<npn> a;

    private npq(wlc<npn> wlc) {
        this.a = wlc;
    }

    public static npq a(wlc<npn> wlc) {
        return new npq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new npp((npn) this.a.get());
    }
}
