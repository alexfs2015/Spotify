package defpackage;

/* renamed from: vkt reason: default package */
public final class vkt implements vua<vju> {
    private final wlc<ghm> a;

    private vkt(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static vkt a(wlc<ghm> wlc) {
        return new vkt(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vju) vuf.a(vju.a((vjw) ((ghm) this.a.get()).a(vjw.class), "client_mobile"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
