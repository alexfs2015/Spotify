package defpackage;

/* renamed from: qkr reason: default package */
public final class qkr implements vua<qkq> {
    private final wlc<qks> a;
    private final wlc<Boolean> b;
    private final wlc<qhr> c;

    private qkr(wlc<qks> wlc, wlc<Boolean> wlc2, wlc<qhr> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qkr a(wlc<qks> wlc, wlc<Boolean> wlc2, wlc<qhr> wlc3) {
        return new qkr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qkq((qks) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (qhr) this.c.get());
    }
}
