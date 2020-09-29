package defpackage;

/* renamed from: nku reason: default package */
public final class nku implements vua<nkd> {
    private final wlc<ghm> a;

    private nku(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static nku a(wlc<ghm> wlc) {
        return new nku(wlc);
    }

    public final /* synthetic */ Object get() {
        return (nkd) vuf.a((nkd) ((ghm) this.a.get()).a(nkd.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
