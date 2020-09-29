package defpackage;

/* renamed from: pcf reason: default package */
public final class pcf implements vua<pce> {
    private final wlc<pcg> a;

    private pcf(wlc<pcg> wlc) {
        this.a = wlc;
    }

    public static pcf a(wlc<pcg> wlc) {
        return new pcf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new pce((pcg) this.a.get());
    }
}
