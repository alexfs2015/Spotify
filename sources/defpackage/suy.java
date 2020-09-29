package defpackage;

/* renamed from: suy reason: default package */
public final class suy implements vua<sux> {
    private final wlc<ghm> a;

    private suy(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static suy a(wlc<ghm> wlc) {
        return new suy(wlc);
    }

    public final /* synthetic */ Object get() {
        return (sux) vuf.a((sux) ((ghm) this.a.get()).a(sux.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
