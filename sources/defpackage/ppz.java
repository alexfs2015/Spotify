package defpackage;

/* renamed from: ppz reason: default package */
public final class ppz implements vua<ppy> {
    private final wlc<rnf> a;

    private ppz(wlc<rnf> wlc) {
        this.a = wlc;
    }

    public static ppz a(wlc<rnf> wlc) {
        return new ppz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ppy((rnf) this.a.get());
    }
}
