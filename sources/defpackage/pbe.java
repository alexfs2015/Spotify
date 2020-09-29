package defpackage;

/* renamed from: pbe reason: default package */
public final class pbe implements vua<tmo> {
    private final wlc<tmo> a;

    private pbe(wlc<tmo> wlc) {
        this.a = wlc;
    }

    public static pbe a(wlc<tmo> wlc) {
        return new pbe(wlc);
    }

    public final /* synthetic */ Object get() {
        return (tmo) vuf.a((tmo) this.a.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
