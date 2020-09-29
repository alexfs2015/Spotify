package defpackage;

/* renamed from: ojq reason: default package */
public final class ojq implements vua<gjb> {
    private final wlc<jol> a;

    private ojq(wlc<jol> wlc) {
        this.a = wlc;
    }

    public static ojq a(wlc<jol> wlc) {
        return new ojq(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gjb) vuf.a(a.a((jol) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
