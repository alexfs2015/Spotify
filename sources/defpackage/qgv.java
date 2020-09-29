package defpackage;

/* renamed from: qgv reason: default package */
public final class qgv implements vua<qgj> {
    private final wlc<ghm> a;

    private qgv(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static qgv a(wlc<ghm> wlc) {
        return new qgv(wlc);
    }

    public final /* synthetic */ Object get() {
        return (qgj) vuf.a((qgj) ((ghm) this.a.get()).a(qgj.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
