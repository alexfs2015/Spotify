package defpackage;

/* renamed from: mmi reason: default package */
public final class mmi implements vua<mmh> {
    private final wlc<mmf> a;
    private final wlc<a> b;
    private final wlc<a> c;

    private mmi(wlc<mmf> wlc, wlc<a> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mmi a(wlc<mmf> wlc, wlc<a> wlc2, wlc<a> wlc3) {
        return new mmi(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mmh((mmf) this.a.get(), (a) this.b.get(), (a) this.c.get());
    }
}
