package defpackage;

/* renamed from: pyg reason: default package */
public final class pyg implements vua<a> {
    private final wlc<pvj> a;

    private pyg(wlc<pvj> wlc) {
        this.a = wlc;
    }

    public static pyg a(wlc<pvj> wlc) {
        return new pyg(wlc);
    }

    public final /* synthetic */ Object get() {
        return (a) vuf.a(pye.a((pvj) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
