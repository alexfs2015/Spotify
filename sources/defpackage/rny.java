package defpackage;

/* renamed from: rny reason: default package */
public final class rny implements vua<rnz> {
    private final wlc<ghm> a;

    private rny(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static rny a(wlc<ghm> wlc) {
        return new rny(wlc);
    }

    public static rnz a(ghm ghm) {
        return (rnz) vuf.a(CC.a(ghm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ghm) this.a.get());
    }
}
