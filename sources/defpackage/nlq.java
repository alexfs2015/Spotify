package defpackage;

/* renamed from: nlq reason: default package */
public final class nlq implements vua<nlp> {
    private final wlc<nln> a;

    private nlq(wlc<nln> wlc) {
        this.a = wlc;
    }

    public static nlq a(wlc<nln> wlc) {
        return new nlq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nlp((nln) this.a.get());
    }
}
