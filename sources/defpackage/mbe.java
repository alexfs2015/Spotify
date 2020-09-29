package defpackage;

/* renamed from: mbe reason: default package */
public final class mbe implements vua<maw> {
    private final wlc<ghm> a;

    private mbe(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static mbe a(wlc<ghm> wlc) {
        return new mbe(wlc);
    }

    public final /* synthetic */ Object get() {
        return (maw) vuf.a((maw) ((ghm) this.a.get()).a(maw.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
