package defpackage;

/* renamed from: stp reason: default package */
public final class stp implements vua<sto> {
    private final wlc<krq> a;

    private stp(wlc<krq> wlc) {
        this.a = wlc;
    }

    public static stp a(wlc<krq> wlc) {
        return new stp(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sto((krq) this.a.get());
    }
}
