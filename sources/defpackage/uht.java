package defpackage;

/* renamed from: uht reason: default package */
public final class uht implements vua<uhs> {
    private final wlc<jvy> a;

    private uht(wlc<jvy> wlc) {
        this.a = wlc;
    }

    public static uht a(wlc<jvy> wlc) {
        return new uht(wlc);
    }

    public final /* synthetic */ Object get() {
        return new uhs((jvy) this.a.get());
    }
}
