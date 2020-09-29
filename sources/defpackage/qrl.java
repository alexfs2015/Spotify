package defpackage;

/* renamed from: qrl reason: default package */
public final class qrl implements vua<qrk> {
    private final wlc<qrs> a;

    private qrl(wlc<qrs> wlc) {
        this.a = wlc;
    }

    public static qrl a(wlc<qrs> wlc) {
        return new qrl(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qrk((qrs) this.a.get());
    }
}
