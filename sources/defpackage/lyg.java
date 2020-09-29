package defpackage;

/* renamed from: lyg reason: default package */
public final class lyg implements vua<a> {
    private final wlc<fpt> a;
    private final wlc<String> b;
    private final wlc<jrp> c;
    private final wlc<String> d;
    private final wlc<Boolean> e;
    private final wlc<Boolean> f;

    private lyg(wlc<fpt> wlc, wlc<String> wlc2, wlc<jrp> wlc3, wlc<String> wlc4, wlc<Boolean> wlc5, wlc<Boolean> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static lyg a(wlc<fpt> wlc, wlc<String> wlc2, wlc<jrp> wlc3, wlc<String> wlc4, wlc<Boolean> wlc5, wlc<Boolean> wlc6) {
        lyg lyg = new lyg(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return lyg;
    }

    public final /* synthetic */ Object get() {
        a aVar = new a((fpt) this.a.get(), (String) this.b.get(), (jrp) this.c.get(), (String) this.d.get(), ((Boolean) this.e.get()).booleanValue(), ((Boolean) this.f.get()).booleanValue());
        return aVar;
    }
}
