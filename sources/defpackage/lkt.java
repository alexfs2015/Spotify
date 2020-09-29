package defpackage;

/* renamed from: lkt reason: default package */
public final class lkt implements vua<lks> {
    private final wlc<spi> a;
    private final wlc<lku> b;
    private final wlc<lkq> c;

    private lkt(wlc<spi> wlc, wlc<lku> wlc2, wlc<lkq> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lkt a(wlc<spi> wlc, wlc<lku> wlc2, wlc<lkq> wlc3) {
        return new lkt(wlc, wlc2, wlc3);
    }

    public static lks a(spi spi, Object obj, Object obj2) {
        return new lks(spi, (lku) obj, (lkq) obj2);
    }

    public final /* synthetic */ Object get() {
        return new lks((spi) this.a.get(), (lku) this.b.get(), (lkq) this.c.get());
    }
}
