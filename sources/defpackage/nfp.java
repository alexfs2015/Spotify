package defpackage;

/* renamed from: nfp reason: default package */
public final class nfp implements vua<wud<String>> {
    private final wlc<hed> a;

    private nfp(wlc<hed> wlc) {
        this.a = wlc;
    }

    public static nfp a(wlc<hed> wlc) {
        return new nfp(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(((hed) this.a.get()).a("ab-home-loading-flow"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
