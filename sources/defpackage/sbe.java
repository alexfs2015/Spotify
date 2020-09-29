package defpackage;

/* renamed from: sbe reason: default package */
public final class sbe implements vua<sbf> {
    private final wlc<ghm> a;

    private sbe(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static sbe a(wlc<ghm> wlc) {
        return new sbe(wlc);
    }

    public final /* synthetic */ Object get() {
        return (sbf) vuf.a((sbf) ((ghm) this.a.get()).a(sbf.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}
