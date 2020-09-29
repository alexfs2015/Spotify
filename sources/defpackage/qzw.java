package defpackage;

/* renamed from: qzw reason: default package */
public final class qzw implements vua<qzv> {
    private final wlc<qsr> a;

    private qzw(wlc<qsr> wlc) {
        this.a = wlc;
    }

    public static qzw a(wlc<qsr> wlc) {
        return new qzw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qzv(this.a);
    }
}
