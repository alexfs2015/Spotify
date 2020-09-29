package defpackage;

/* renamed from: oqt reason: default package */
public final class oqt implements vua<oqs> {
    private final wlc<tcn> a;
    private final wlc<ose> b;
    private final wlc<oqu> c;

    private oqt(wlc<tcn> wlc, wlc<ose> wlc2, wlc<oqu> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static oqt a(wlc<tcn> wlc, wlc<ose> wlc2, wlc<oqu> wlc3) {
        return new oqt(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new oqs(this.a, this.b, this.c);
    }
}
