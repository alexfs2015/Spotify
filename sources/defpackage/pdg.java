package defpackage;

/* renamed from: pdg reason: default package */
public final class pdg implements vua<pdf> {
    private final wlc<Boolean> a;
    private final wlc<pdh> b;

    private pdg(wlc<Boolean> wlc, wlc<pdh> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pdg a(wlc<Boolean> wlc, wlc<pdh> wlc2) {
        return new pdg(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pdf(((Boolean) this.a.get()).booleanValue(), (pdh) this.b.get());
    }
}
