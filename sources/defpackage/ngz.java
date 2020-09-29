package defpackage;

/* renamed from: ngz reason: default package */
public final class ngz implements vua<ngy> {
    private final wlc<net> a;
    private final wlc<gxz> b;

    private ngz(wlc<net> wlc, wlc<gxz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ngz a(wlc<net> wlc, wlc<gxz> wlc2) {
        return new ngz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ngy((net) this.a.get(), (gxz) this.b.get());
    }
}
