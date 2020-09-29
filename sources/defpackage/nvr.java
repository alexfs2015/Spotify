package defpackage;

/* renamed from: nvr reason: default package */
public final class nvr implements vua<nvq> {
    private final wlc<rvg> a;
    private final wlc<nvw> b;

    private nvr(wlc<rvg> wlc, wlc<nvw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nvr a(wlc<rvg> wlc, wlc<nvw> wlc2) {
        return new nvr(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new nvq((rvg) this.a.get(), (nvw) this.b.get());
    }
}
