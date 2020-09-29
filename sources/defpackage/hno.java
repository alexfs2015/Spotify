package defpackage;

/* renamed from: hno reason: default package */
public final class hno implements vua<hsg> {
    private final wlc<ghm> a;

    private hno(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static hno a(wlc<ghm> wlc) {
        return new hno(wlc);
    }

    public final /* synthetic */ Object get() {
        return (hsg) vuf.a((hsg) ((ghm) this.a.get()).a(hsg.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
