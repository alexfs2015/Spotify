package defpackage;

/* renamed from: hhq reason: default package */
public final class hhq implements vua<hhp> {
    private final wlc<hmw> a;

    private hhq(wlc<hmw> wlc) {
        this.a = wlc;
    }

    public static hhq a(wlc<hmw> wlc) {
        return new hhq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hhp((hmw) this.a.get());
    }
}
