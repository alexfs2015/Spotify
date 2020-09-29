package defpackage;

/* renamed from: qlr reason: default package */
public final class qlr implements vua<qlq> {
    private final wlc<qmc> a;
    private final wlc<qmc> b;

    private qlr(wlc<qmc> wlc, wlc<qmc> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qlr a(wlc<qmc> wlc, wlc<qmc> wlc2) {
        return new qlr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qlq((qmc) this.a.get(), (qmc) this.b.get());
    }
}
