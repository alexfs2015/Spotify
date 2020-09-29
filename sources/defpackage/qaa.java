package defpackage;

/* renamed from: qaa reason: default package */
public final class qaa implements vua<a> {
    private final wlc<pzt> a;

    private qaa(wlc<pzt> wlc) {
        this.a = wlc;
    }

    public static qaa a(wlc<pzt> wlc) {
        return new qaa(wlc);
    }

    public final /* synthetic */ Object get() {
        return (a) vuf.a(pzz.a((pzt) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
