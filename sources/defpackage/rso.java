package defpackage;

/* renamed from: rso reason: default package */
public final class rso implements vua<rsq> {
    private final wlc<ghm> a;

    private rso(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static rso a(wlc<ghm> wlc) {
        return new rso(wlc);
    }

    public final /* synthetic */ Object get() {
        return (rsq) vuf.a((rsq) ((ghm) this.a.get()).b(rsq.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
