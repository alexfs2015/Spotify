package defpackage;

/* renamed from: sck reason: default package */
public final class sck implements vua<scj> {
    private final wlc<spi> a;

    private sck(wlc<spi> wlc) {
        this.a = wlc;
    }

    public static sck a(wlc<spi> wlc) {
        return new sck(wlc);
    }

    public final /* synthetic */ Object get() {
        return new scj((spi) this.a.get());
    }
}
