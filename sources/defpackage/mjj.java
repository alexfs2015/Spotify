package defpackage;

/* renamed from: mjj reason: default package */
public final class mjj implements vua<mji> {
    private final wlc<ghm> a;

    private mjj(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static mjj a(wlc<ghm> wlc) {
        return new mjj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (mji) vuf.a((mji) ((ghm) this.a.get()).a(mji.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
