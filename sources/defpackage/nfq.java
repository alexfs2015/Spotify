package defpackage;

/* renamed from: nfq reason: default package */
public final class nfq implements vua<Boolean> {
    private final wlc<ngf> a;
    private final wlc<fpt> b;

    private nfq(wlc<ngf> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nfq a(wlc<ngf> wlc, wlc<fpt> wlc2) {
        return new nfq(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        ngf ngf = (ngf) this.a.get();
        return Boolean.valueOf(((String) ((fpt) this.b.get()).a(nge.d)).contains("Enabled"));
    }
}
