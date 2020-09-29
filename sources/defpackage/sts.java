package defpackage;

/* renamed from: sts reason: default package */
public final class sts implements vua<stn> {
    private final wlc<stq> a;
    private final wlc<ssa> b;

    private sts(wlc<stq> wlc, wlc<ssa> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static sts a(wlc<stq> wlc, wlc<ssa> wlc2) {
        return new sts(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new stn((stq) this.a.get(), (ssa) this.b.get());
    }
}
