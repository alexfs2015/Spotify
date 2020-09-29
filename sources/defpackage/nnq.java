package defpackage;

/* renamed from: nnq reason: default package */
public final class nnq implements vua<nnp> {
    private final wlc<nnn> a;

    private nnq(wlc<nnn> wlc) {
        this.a = wlc;
    }

    public static nnq a(wlc<nnn> wlc) {
        return new nnq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nnp((nnn) this.a.get());
    }
}
