package defpackage;

/* renamed from: nhb reason: default package */
public final class nhb implements vua<nha> {
    private final wlc<net> a;
    private final wlc<gxz> b;

    private nhb(wlc<net> wlc, wlc<gxz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nhb a(wlc<net> wlc, wlc<gxz> wlc2) {
        return new nhb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new nha((net) this.a.get(), (gxz) this.b.get());
    }
}
