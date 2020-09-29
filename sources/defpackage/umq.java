package defpackage;

/* renamed from: umq reason: default package */
public final class umq implements vua<umc> {
    private final wlc<jjf> a;

    private umq(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static umq a(wlc<jjf> wlc) {
        return new umq(wlc);
    }

    public final /* synthetic */ Object get() {
        return (umc) vuf.a(new umc((jjf) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
