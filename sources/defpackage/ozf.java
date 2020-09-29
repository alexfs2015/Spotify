package defpackage;

/* renamed from: ozf reason: default package */
public final class ozf implements vua<oze> {
    private final wlc<spi> a;
    private final wlc<ozg> b;

    private ozf(wlc<spi> wlc, wlc<ozg> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ozf a(wlc<spi> wlc, wlc<ozg> wlc2) {
        return new ozf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new oze((spi) this.a.get(), (ozg) this.b.get());
    }
}
