package defpackage;

/* renamed from: rls reason: default package */
public final class rls implements vua<rlr> {
    private final wlc<rlj> a;
    private final wlc<rnf> b;

    private rls(wlc<rlj> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rls a(wlc<rlj> wlc, wlc<rnf> wlc2) {
        return new rls(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rlr((rlj) this.a.get(), (rnf) this.b.get());
    }
}
