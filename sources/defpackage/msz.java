package defpackage;

/* renamed from: msz reason: default package */
public final class msz implements vua<mvi> {
    private final wlc<Boolean> a;
    private final wlc<mva> b;
    private final wlc<mvj> c;

    private msz(wlc<Boolean> wlc, wlc<mva> wlc2, wlc<mvj> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static msz a(wlc<Boolean> wlc, wlc<mva> wlc2, wlc<mvj> wlc3) {
        return new msz(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        mvj mvj = (mva) this.b.get();
        mvj mvj2 = (mvj) this.c.get();
        if (!((Boolean) this.a.get()).booleanValue()) {
            mvj = mvj2;
        }
        return (mvi) vuf.a(mvj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
