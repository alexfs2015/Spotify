package defpackage;

/* renamed from: tkr reason: default package */
public final class tkr implements vua<tkq> {
    private final wlc<spi> a;

    private tkr(wlc<spi> wlc) {
        this.a = wlc;
    }

    public static tkr a(wlc<spi> wlc) {
        return new tkr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tkq((spi) this.a.get());
    }
}
