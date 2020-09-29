package defpackage;

/* renamed from: qbz reason: default package */
public final class qbz implements vua<qby> {
    private final wlc<Boolean> a;

    private qbz(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static qbz a(wlc<Boolean> wlc) {
        return new qbz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qby(((Boolean) this.a.get()).booleanValue());
    }
}
