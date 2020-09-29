package defpackage;

/* renamed from: paz reason: default package */
public final class paz implements vua<pam> {
    private final wlc<ghm> a;

    private paz(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static paz a(wlc<ghm> wlc) {
        return new paz(wlc);
    }

    public final /* synthetic */ Object get() {
        return (pam) vuf.a((pam) ((ghm) this.a.get()).a(pam.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
