package defpackage;

/* renamed from: oxs reason: default package */
public final class oxs implements vua<ozr> {
    private final wlc<ghm> a;

    private oxs(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static oxs a(wlc<ghm> wlc) {
        return new oxs(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ozr) vuf.a((ozr) ((ghm) this.a.get()).a(ozr.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
