package defpackage;

/* renamed from: kxu reason: default package */
public final class kxu implements vua<kxs> {
    private final wlc<kxv> a;

    private kxu(wlc<kxv> wlc) {
        this.a = wlc;
    }

    public static kxu a(wlc<kxv> wlc) {
        return new kxu(wlc);
    }

    public final /* synthetic */ Object get() {
        return (kxs) vuf.a(new kxt((kxv) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
