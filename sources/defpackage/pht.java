package defpackage;

/* renamed from: pht reason: default package */
public final class pht implements vua<phs> {
    private final wlc<phi> a;
    private final wlc<phk> b;

    private pht(wlc<phi> wlc, wlc<phk> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pht a(wlc<phi> wlc, wlc<phk> wlc2) {
        return new pht(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new phs((phi) this.a.get(), (phk) this.b.get());
    }
}
