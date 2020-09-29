package defpackage;

/* renamed from: ntg reason: default package */
public final class ntg implements vua<nsp> {
    private final wlc<ghm> a;

    private ntg(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static ntg a(wlc<ghm> wlc) {
        return new ntg(wlc);
    }

    public final /* synthetic */ Object get() {
        return (nsp) vuf.a((nsp) ((ghm) this.a.get()).a(nsp.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
