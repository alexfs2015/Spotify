package defpackage;

/* renamed from: qbq reason: default package */
public final class qbq implements vua<qbp> {
    private final wlc<Boolean> a;

    private qbq(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static qbq a(wlc<Boolean> wlc) {
        return new qbq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qbp(((Boolean) this.a.get()).booleanValue());
    }
}
