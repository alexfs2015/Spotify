package defpackage;

/* renamed from: oxq reason: default package */
public final class oxq implements vua<ozk> {
    private final wlc<ghm> a;

    private oxq(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static oxq a(wlc<ghm> wlc) {
        return new oxq(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ozk) vuf.a((ozk) ((ghm) this.a.get()).a(ozk.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
