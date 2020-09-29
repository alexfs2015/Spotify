package defpackage;

/* renamed from: pbg reason: default package */
public final class pbg implements vua<hez<paq>> {
    private final wlc<wug> a;

    private pbg(wlc<wug> wlc) {
        this.a = wlc;
    }

    public static pbg a(wlc<wug> wlc) {
        return new pbg(wlc);
    }

    public final /* synthetic */ Object get() {
        return (hez) vuf.a(new a(new b(), (wug) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
