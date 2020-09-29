package defpackage;

/* renamed from: pdb reason: default package */
public final class pdb implements vua<pct> {
    private final wlc<ghm> a;

    private pdb(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static pdb a(wlc<ghm> wlc) {
        return new pdb(wlc);
    }

    public final /* synthetic */ Object get() {
        return (pct) vuf.a((pct) ((ghm) this.a.get()).a(pct.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
