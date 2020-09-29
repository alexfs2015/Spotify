package defpackage;

/* renamed from: kox reason: default package */
public final class kox implements vua<a> {
    private final wlc<koi> a;

    private kox(wlc<koi> wlc) {
        this.a = wlc;
    }

    public static kox a(wlc<koi> wlc) {
        return new kox(wlc);
    }

    public final /* synthetic */ Object get() {
        return (a) vuf.a(CC.a((koi) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
