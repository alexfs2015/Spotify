package defpackage;

/* renamed from: jxp reason: default package */
public final class jxp implements vua<jxo> {
    private final wlc<jsz> a;
    private final wlc<twr> b;
    private final wlc<jyl> c;

    private jxp(wlc<jsz> wlc, wlc<twr> wlc2, wlc<jyl> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static jxp a(wlc<jsz> wlc, wlc<twr> wlc2, wlc<jyl> wlc3) {
        return new jxp(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new jxo((jsz) this.a.get(), (twr) this.b.get(), (jyl) this.c.get());
    }
}
