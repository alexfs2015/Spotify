package defpackage;

/* renamed from: tsq reason: default package */
public final class tsq implements vua<tsp> {
    private final wlc<tso> a;

    private tsq(wlc<tso> wlc) {
        this.a = wlc;
    }

    public static tsq a(wlc<tso> wlc) {
        return new tsq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tsp((tso) this.a.get());
    }
}
