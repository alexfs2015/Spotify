package defpackage;

/* renamed from: llk reason: default package */
public final class llk implements vua<vju> {
    private final wlc<ghm> a;

    private llk(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static llk a(wlc<ghm> wlc) {
        return new llk(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vju) vuf.a(vju.a((vjw) ((ghm) this.a.get()).a(vjw.class), "client_mobile"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
