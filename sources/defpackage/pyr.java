package defpackage;

/* renamed from: pyr reason: default package */
public final class pyr implements vua<pyq> {
    private final wlc<fpt> a;
    private final wlc<Boolean> b;
    private final wlc<String> c;
    private final wlc<rza> d;
    private final wlc<rzb> e;

    private pyr(wlc<fpt> wlc, wlc<Boolean> wlc2, wlc<String> wlc3, wlc<rza> wlc4, wlc<rzb> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static pyr a(wlc<fpt> wlc, wlc<Boolean> wlc2, wlc<String> wlc3, wlc<rza> wlc4, wlc<rzb> wlc5) {
        pyr pyr = new pyr(wlc, wlc2, wlc3, wlc4, wlc5);
        return pyr;
    }

    public final /* synthetic */ Object get() {
        pyq pyq = new pyq((fpt) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (String) this.c.get(), (rza) this.d.get(), (rzb) this.e.get());
        return pyq;
    }
}
