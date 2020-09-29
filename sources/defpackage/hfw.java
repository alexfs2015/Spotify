package defpackage;

/* renamed from: hfw reason: default package */
public final class hfw implements vua<hft> {
    private final wlc<jrp> a;

    private hfw(wlc<jrp> wlc) {
        this.a = wlc;
    }

    public static hfw a(wlc<jrp> wlc) {
        return new hfw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hft((jrp) this.a.get());
    }
}
