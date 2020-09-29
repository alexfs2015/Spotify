package defpackage;

/* renamed from: otj reason: default package */
public final class otj implements vua<ots> {
    private final wlc<ghm> a;

    private otj(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static otj a(wlc<ghm> wlc) {
        return new otj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ots) vuf.a((ots) ((ghm) this.a.get()).b(ots.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
