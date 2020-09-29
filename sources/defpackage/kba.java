package defpackage;

/* renamed from: kba reason: default package */
public final class kba implements vua<kaz> {
    private final wlc<gbd> a;

    private kba(wlc<gbd> wlc) {
        this.a = wlc;
    }

    public static kba a(wlc<gbd> wlc) {
        return new kba(wlc);
    }

    public final /* synthetic */ Object get() {
        return new kaz((gbd) this.a.get());
    }
}
