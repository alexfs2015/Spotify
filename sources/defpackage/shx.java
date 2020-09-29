package defpackage;

/* renamed from: shx reason: default package */
public final class shx implements vua<shw> {
    private final wlc<spi> a;
    private final wlc<String> b;

    private shx(wlc<spi> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static shx a(wlc<spi> wlc, wlc<String> wlc2) {
        return new shx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new shw((spi) this.a.get(), (String) this.b.get());
    }
}
