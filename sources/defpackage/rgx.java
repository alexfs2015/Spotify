package defpackage;

/* renamed from: rgx reason: default package */
public final class rgx implements vua<rgw> {
    private final wlc<spi> a;
    private final wlc<rfk> b;

    private rgx(wlc<spi> wlc, wlc<rfk> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rgx a(wlc<spi> wlc, wlc<rfk> wlc2) {
        return new rgx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rgw((spi) this.a.get(), (rfk) this.b.get());
    }
}
