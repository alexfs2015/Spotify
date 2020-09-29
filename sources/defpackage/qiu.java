package defpackage;

/* renamed from: qiu reason: default package */
public final class qiu implements vua<qks> {
    private final wlc<ghm> a;

    private qiu(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static qiu a(wlc<ghm> wlc) {
        return new qiu(wlc);
    }

    public final /* synthetic */ Object get() {
        return (qks) vuf.a((qks) ((ghm) this.a.get()).a(qks.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
