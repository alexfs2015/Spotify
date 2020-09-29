package defpackage;

/* renamed from: qah reason: default package */
public final class qah implements vua<qag> {
    private final wlc<shc> a;

    private qah(wlc<shc> wlc) {
        this.a = wlc;
    }

    public static qah a(wlc<shc> wlc) {
        return new qah(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qag((shc) this.a.get());
    }
}
