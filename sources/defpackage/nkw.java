package defpackage;

/* renamed from: nkw reason: default package */
public final class nkw implements vua<nke> {
    private final wlc<ghm> a;

    private nkw(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static nkw a(wlc<ghm> wlc) {
        return new nkw(wlc);
    }

    public final /* synthetic */ Object get() {
        return (nke) vuf.a((nke) ((ghm) this.a.get()).a(nke.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
