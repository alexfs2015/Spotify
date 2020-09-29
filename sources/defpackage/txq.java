package defpackage;

/* renamed from: txq reason: default package */
public final class txq implements vua<txp> {
    private final wlc<vhl> a;

    private txq(wlc<vhl> wlc) {
        this.a = wlc;
    }

    public static txq a(wlc<vhl> wlc) {
        return new txq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new txp((vhl) this.a.get());
    }
}
