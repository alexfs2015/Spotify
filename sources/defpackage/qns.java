package defpackage;

/* renamed from: qns reason: default package */
public final class qns implements vua<qnr> {
    private final wlc<qnt> a;

    private qns(wlc<qnt> wlc) {
        this.a = wlc;
    }

    public static qns a(wlc<qnt> wlc) {
        return new qns(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qnr((qnt) this.a.get());
    }
}
