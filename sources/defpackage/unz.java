package defpackage;

/* renamed from: unz reason: default package */
public final class unz implements vua<unx> {
    private final wlc<ghm> a;

    private unz(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static unz a(wlc<ghm> wlc) {
        return new unz(wlc);
    }

    public static unx a(ghm ghm) {
        return (unx) vuf.a(CC.a(ghm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ghm) this.a.get());
    }
}
