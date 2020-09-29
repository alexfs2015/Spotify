package defpackage;

/* renamed from: rma reason: default package */
public final class rma implements vua<rlz> {
    private final wlc<rli> a;
    private final wlc<rmb> b;

    private rma(wlc<rli> wlc, wlc<rmb> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rma a(wlc<rli> wlc, wlc<rmb> wlc2) {
        return new rma(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rlz((rli) this.a.get(), (rmb) this.b.get());
    }
}
