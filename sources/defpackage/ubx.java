package defpackage;

/* renamed from: ubx reason: default package */
public final class ubx implements vua<ucf> {
    private final wlc<ghm> a;

    private ubx(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static ubx a(wlc<ghm> wlc) {
        return new ubx(wlc);
    }

    public final /* synthetic */ Object get() {
        return (ucf) vuf.a((ucf) ((ghm) this.a.get()).a(ucf.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
