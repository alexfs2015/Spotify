package defpackage;

/* renamed from: qad reason: default package */
public final class qad implements vua<Boolean> {
    private final wlc<sgr> a;
    private final wlc<fpt> b;

    private qad(wlc<sgr> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qad a(wlc<sgr> wlc, wlc<fpt> wlc2) {
        return new qad(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        sgr sgr = (sgr) this.a.get();
        return Boolean.valueOf(sgr.b((fpt) this.b.get()));
    }
}
