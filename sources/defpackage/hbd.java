package defpackage;

/* renamed from: hbd reason: default package */
public final class hbd implements vua<hbc> {
    private final wlc<gpx> a;

    private hbd(wlc<gpx> wlc) {
        this.a = wlc;
    }

    public static hbd a(wlc<gpx> wlc) {
        return new hbd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hbc((gpx) this.a.get());
    }
}
