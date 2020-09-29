package defpackage;

/* renamed from: tip reason: default package */
public final class tip implements vua<tio> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;

    private tip(wlc<jjf> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tip a(wlc<jjf> wlc, wlc<jrp> wlc2) {
        return new tip(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tio((jjf) this.a.get(), (jrp) this.b.get());
    }
}
