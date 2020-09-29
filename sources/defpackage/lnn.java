package defpackage;

/* renamed from: lnn reason: default package */
public final class lnn implements vua<lnm> {
    private final wlc<uqw> a;

    private lnn(wlc<uqw> wlc) {
        this.a = wlc;
    }

    public static lnn a(wlc<uqw> wlc) {
        return new lnn(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lnm((uqw) this.a.get());
    }
}
