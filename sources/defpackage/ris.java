package defpackage;

/* renamed from: ris reason: default package */
public final class ris implements vua<rir> {
    private final wlc<rhu> a;
    private final wlc<vsd> b;

    private ris(wlc<rhu> wlc, wlc<vsd> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ris a(wlc<rhu> wlc, wlc<vsd> wlc2) {
        return new ris(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rir((rhu) this.a.get(), (vsd) this.b.get());
    }
}
