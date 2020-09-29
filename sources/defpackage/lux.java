package defpackage;

/* renamed from: lux reason: default package */
public final class lux implements vua<luw> {
    private final wlc<luy> a;
    private final wlc<gxz> b;

    private lux(wlc<luy> wlc, wlc<gxz> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lux a(wlc<luy> wlc, wlc<gxz> wlc2) {
        return new lux(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new luw((luy) this.a.get(), (gxz) this.b.get());
    }
}
