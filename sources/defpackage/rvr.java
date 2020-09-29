package defpackage;

/* renamed from: rvr reason: default package */
public final class rvr implements vua<rvq> {
    private final wlc<rvv> a;

    private rvr(wlc<rvv> wlc) {
        this.a = wlc;
    }

    public static rvr a(wlc<rvv> wlc) {
        return new rvr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rvq((rvv) this.a.get());
    }
}
