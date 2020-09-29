package defpackage;

/* renamed from: toi reason: default package */
public final class toi implements vua<toh> {
    private final wlc<rxf> a;
    private final wlc<Boolean> b;

    private toi(wlc<rxf> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static toi a(wlc<rxf> wlc, wlc<Boolean> wlc2) {
        return new toi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new toh((rxf) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
