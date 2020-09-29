package defpackage;

/* renamed from: idn reason: default package */
public final class idn implements vua<idm> {
    private final wlc<ido> a;
    private final wlc<ids> b;

    private idn(wlc<ido> wlc, wlc<ids> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static idn a(wlc<ido> wlc, wlc<ids> wlc2) {
        return new idn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new idm((ido) this.a.get(), (ids) this.b.get());
    }
}
