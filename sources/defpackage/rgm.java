package defpackage;

/* renamed from: rgm reason: default package */
public final class rgm implements vua<rgl> {
    private final wlc<uvf> a;

    private rgm(wlc<uvf> wlc) {
        this.a = wlc;
    }

    public static rgm a(wlc<uvf> wlc) {
        return new rgm(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rgl((uvf) this.a.get());
    }
}
