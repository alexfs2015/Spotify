package defpackage;

/* renamed from: ooy reason: default package */
public final class ooy implements vua<oox> {
    private final wlc<oos> a;
    private final wlc<ofh> b;
    private final wlc<oew> c;
    private final wlc<a> d;

    private ooy(wlc<oos> wlc, wlc<ofh> wlc2, wlc<oew> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ooy a(wlc<oos> wlc, wlc<ofh> wlc2, wlc<oew> wlc3, wlc<a> wlc4) {
        return new ooy(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new oox(this.a, this.b, this.c, this.d);
    }
}
