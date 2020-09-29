package defpackage;

/* renamed from: tvq reason: default package */
public final class tvq implements vua<tvp> {
    private final wlc<jug> a;
    private final wlc<tvh> b;

    private tvq(wlc<jug> wlc, wlc<tvh> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tvq a(wlc<jug> wlc, wlc<tvh> wlc2) {
        return new tvq(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tvp((jug) this.a.get(), (tvh) this.b.get());
    }
}
