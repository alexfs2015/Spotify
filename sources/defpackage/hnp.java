package defpackage;

/* renamed from: hnp reason: default package */
public final class hnp implements vua<hsh> {
    private final wlc<ghm> a;

    private hnp(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static hnp a(wlc<ghm> wlc) {
        return new hnp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (hsh) vuf.a((hsh) ((ghm) this.a.get()).a(hsh.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
