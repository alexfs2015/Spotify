package defpackage;

/* renamed from: gdg reason: default package */
public final class gdg implements vua<gdf> {
    private final wlc<gho> a;
    private final wlc<rnf> b;

    private gdg(wlc<gho> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static gdg a(wlc<gho> wlc, wlc<rnf> wlc2) {
        return new gdg(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new gdf((gho) this.a.get(), (rnf) this.b.get());
    }
}
