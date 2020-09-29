package defpackage;

/* renamed from: rnk reason: default package */
public final class rnk implements vua<rnd> {
    private final wlc<rnf> a;

    private rnk(wlc<rnf> wlc) {
        this.a = wlc;
    }

    public static rnk a(wlc<rnf> wlc) {
        return new rnk(wlc);
    }

    public final /* synthetic */ Object get() {
        return (rnd) vuf.a(((rnf) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
