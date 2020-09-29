package defpackage;

/* renamed from: rkv reason: default package */
public final class rkv implements vua<rku> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;

    private rkv(wlc<jjf> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rkv a(wlc<jjf> wlc, wlc<jrp> wlc2) {
        return new rkv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rku((jjf) this.a.get(), (jrp) this.b.get());
    }
}
