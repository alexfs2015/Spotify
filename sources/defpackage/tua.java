package defpackage;

/* renamed from: tua reason: default package */
public final class tua implements vua<ttz> {
    private final wlc<tmy> a;
    private final wlc<ttm> b;
    private final wlc<Boolean> c;
    private final wlc<ttv> d;
    private final wlc<tuf> e;

    private tua(wlc<tmy> wlc, wlc<ttm> wlc2, wlc<Boolean> wlc3, wlc<ttv> wlc4, wlc<tuf> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static tua a(wlc<tmy> wlc, wlc<ttm> wlc2, wlc<Boolean> wlc3, wlc<ttv> wlc4, wlc<tuf> wlc5) {
        tua tua = new tua(wlc, wlc2, wlc3, wlc4, wlc5);
        return tua;
    }

    public final /* synthetic */ Object get() {
        ttz ttz = new ttz((tmy) this.a.get(), (ttm) this.b.get(), ((Boolean) this.c.get()).booleanValue(), (ttv) this.d.get(), (tuf) this.e.get());
        return ttz;
    }
}
