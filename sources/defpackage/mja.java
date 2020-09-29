package defpackage;

/* renamed from: mja reason: default package */
public final class mja implements vua<miz> {
    private final wlc<ghm> a;

    private mja(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static mja a(wlc<ghm> wlc) {
        return new mja(wlc);
    }

    public final /* synthetic */ Object get() {
        return (miz) vuf.a((miz) ((ghm) this.a.get()).a(miz.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
