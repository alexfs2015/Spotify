package defpackage;

/* renamed from: qqg reason: default package */
public final class qqg implements vua<qqf> {
    private final wlc<qpx> a;
    private final wlc<qpl> b;

    private qqg(wlc<qpx> wlc, wlc<qpl> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qqg a(wlc<qpx> wlc, wlc<qpl> wlc2) {
        return new qqg(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qqf(vtz.b(this.a), (qpl) this.b.get());
    }
}
