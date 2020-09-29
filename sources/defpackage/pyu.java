package defpackage;

/* renamed from: pyu reason: default package */
public final class pyu implements vua<pyt> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;

    private pyu(wlc<jjf> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pyu a(wlc<jjf> wlc, wlc<jrp> wlc2) {
        return new pyu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pyt((jjf) this.a.get(), (jrp) this.b.get());
    }
}
