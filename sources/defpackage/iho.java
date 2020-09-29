package defpackage;

/* renamed from: iho reason: default package */
public final class iho implements vua<lnz> {
    private final wlc<ghm> a;

    private iho(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static iho a(wlc<ghm> wlc) {
        return new iho(wlc);
    }

    public final /* synthetic */ Object get() {
        return (lnz) vuf.a((lnz) ((ghm) this.a.get()).a(lnz.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
