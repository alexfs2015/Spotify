package defpackage;

/* renamed from: lkr reason: default package */
public final class lkr implements vua<lkq> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;

    private lkr(wlc<jjf> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lkr a(wlc<jjf> wlc, wlc<jrp> wlc2) {
        return new lkr(wlc, wlc2);
    }

    public static lkq b(wlc<jjf> wlc, wlc<jrp> wlc2) {
        return new lkq(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new lkq(this.a, this.b);
    }
}
