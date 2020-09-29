package defpackage;

/* renamed from: nwn reason: default package */
public final class nwn implements vua<nwh> {
    private final wlc<ghm> a;

    private nwn(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static nwn a(wlc<ghm> wlc) {
        return new nwn(wlc);
    }

    public final /* synthetic */ Object get() {
        return (nwh) vuf.a((nwh) ((ghm) this.a.get()).b(nwh.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
