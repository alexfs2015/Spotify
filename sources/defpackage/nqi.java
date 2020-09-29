package defpackage;

/* renamed from: nqi reason: default package */
public final class nqi implements vua<nqh> {
    private final wlc<ghm> a;

    private nqi(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static nqi a(wlc<ghm> wlc) {
        return new nqi(wlc);
    }

    public final /* synthetic */ Object get() {
        return (nqh) vuf.a((nqh) ((ghm) this.a.get()).b(nqh.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
