package defpackage;

/* renamed from: tpa reason: default package */
public final class tpa implements vua<toz> {
    private final wlc<tkv> a;
    private final wlc<tnh> b;
    private final wlc<tnb> c;
    private final wlc<tli> d;
    private final wlc<a> e;
    private final wlc<tpg> f;
    private final wlc<kom> g;
    private final wlc<Boolean> h;

    private tpa(wlc<tkv> wlc, wlc<tnh> wlc2, wlc<tnb> wlc3, wlc<tli> wlc4, wlc<a> wlc5, wlc<tpg> wlc6, wlc<kom> wlc7, wlc<Boolean> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static tpa a(wlc<tkv> wlc, wlc<tnh> wlc2, wlc<tnb> wlc3, wlc<tli> wlc4, wlc<a> wlc5, wlc<tpg> wlc6, wlc<kom> wlc7, wlc<Boolean> wlc8) {
        tpa tpa = new tpa(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return tpa;
    }

    public final /* synthetic */ Object get() {
        toz toz = new toz((tkv) this.a.get(), (tnh) this.b.get(), (tnb) this.c.get(), (tli) this.d.get(), vtz.b(this.e), (tpg) this.f.get(), (kom) this.g.get(), ((Boolean) this.h.get()).booleanValue());
        return toz;
    }
}
