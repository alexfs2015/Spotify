package defpackage;

/* renamed from: msq reason: default package */
public final class msq implements vua<msp> {
    private final wlc<jmq> a;
    private final wlc<Boolean> b;

    private msq(wlc<jmq> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static msq a(wlc<jmq> wlc, wlc<Boolean> wlc2) {
        return new msq(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new msp((jmq) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
