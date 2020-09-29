package defpackage;

/* renamed from: kyk reason: default package */
public final class kyk implements vua<gjb> {
    private final wlc<jol> a;

    private kyk(wlc<jol> wlc) {
        this.a = wlc;
    }

    public static kyk a(wlc<jol> wlc) {
        return new kyk(wlc);
    }

    public static gjb a(jol jol) {
        return (gjb) vuf.a(a.a(jol), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((jol) this.a.get());
    }
}
