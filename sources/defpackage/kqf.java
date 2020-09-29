package defpackage;

/* renamed from: kqf reason: default package */
public final class kqf implements vua<kqe> {
    private final wlc<hec> a;
    private final wlc<ghm> b;

    private kqf(wlc<hec> wlc, wlc<ghm> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kqf a(wlc<hec> wlc, wlc<ghm> wlc2) {
        return new kqf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kqe((hec) this.a.get(), (ghm) this.b.get());
    }
}
