package defpackage;

/* renamed from: obt reason: default package */
public final class obt implements vua<vju> {
    private final wlc<ghm> a;

    private obt(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static obt a(wlc<ghm> wlc) {
        return new obt(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vju) vuf.a(vju.a((vjw) ((ghm) this.a.get()).a(vjw.class), "client_mobile"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
