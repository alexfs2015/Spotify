package defpackage;

/* renamed from: koo reason: default package */
public final class koo implements vua<kon> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;

    private koo(wlc<jjf> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static koo a(wlc<jjf> wlc, wlc<jrp> wlc2) {
        return new koo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kon((jjf) this.a.get(), (jrp) this.b.get());
    }
}
