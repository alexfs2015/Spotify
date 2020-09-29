package defpackage;

/* renamed from: sbc reason: default package */
public final class sbc implements vua<sbb> {
    private final wlc<jrp> a;
    private final wlc<String> b;
    private final wlc<jro> c;
    private final wlc<Boolean> d;
    private final wlc<Boolean> e;
    private final wlc<sax> f;
    private final wlc<sat> g;
    private final wlc<saw> h;

    private sbc(wlc<jrp> wlc, wlc<String> wlc2, wlc<jro> wlc3, wlc<Boolean> wlc4, wlc<Boolean> wlc5, wlc<sax> wlc6, wlc<sat> wlc7, wlc<saw> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static sbc a(wlc<jrp> wlc, wlc<String> wlc2, wlc<jro> wlc3, wlc<Boolean> wlc4, wlc<Boolean> wlc5, wlc<sax> wlc6, wlc<sat> wlc7, wlc<saw> wlc8) {
        sbc sbc = new sbc(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return sbc;
    }

    public final /* synthetic */ Object get() {
        sbb sbb = new sbb((jrp) this.a.get(), (String) this.b.get(), (jro) this.c.get(), ((Boolean) this.d.get()).booleanValue(), ((Boolean) this.e.get()).booleanValue(), (sax) this.f.get(), (sat) this.g.get(), (saw) this.h.get());
        return sbb;
    }
}
