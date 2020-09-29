package defpackage;

/* renamed from: krm reason: default package */
public final class krm implements vua<krk> {
    private final wlc<ghm> a;

    private krm(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static krm a(wlc<ghm> wlc) {
        return new krm(wlc);
    }

    public static krk a(ghm ghm) {
        return (krk) vuf.a(CC.a(ghm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ghm) this.a.get());
    }
}
