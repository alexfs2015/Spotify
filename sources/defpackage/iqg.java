package defpackage;

/* renamed from: iqg reason: default package */
public final class iqg implements vua<iqf> {
    private final wlc<gpx> a;

    private iqg(wlc<gpx> wlc) {
        this.a = wlc;
    }

    public static iqg a(wlc<gpx> wlc) {
        return new iqg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new iqf((gpx) this.a.get());
    }
}
