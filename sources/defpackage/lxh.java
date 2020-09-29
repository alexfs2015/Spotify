package defpackage;

/* renamed from: lxh reason: default package */
public final class lxh implements vua<lyr> {
    private final wlc<ghm> a;

    private lxh(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static lxh a(wlc<ghm> wlc) {
        return new lxh(wlc);
    }

    public final /* synthetic */ Object get() {
        return (lyr) vuf.a((lyr) ((ghm) this.a.get()).a(lyr.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
