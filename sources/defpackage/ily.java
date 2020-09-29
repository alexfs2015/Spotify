package defpackage;

/* renamed from: ily reason: default package */
public final class ily implements vua<ilx> {
    private final wlc<ile> a;
    private final wlc<ilv> b;

    private ily(wlc<ile> wlc, wlc<ilv> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ily a(wlc<ile> wlc, wlc<ilv> wlc2) {
        return new ily(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ilx((ile) this.a.get(), (ilv) this.b.get());
    }
}
