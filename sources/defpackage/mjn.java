package defpackage;

/* renamed from: mjn reason: default package */
public final class mjn implements vua<mjm> {
    private final wlc<ovb> a;
    private final wlc<a> b;
    private final wlc<a> c;
    private final wlc<mjk> d;
    private final wlc<mjd> e;
    private final wlc<mjw> f;
    private final wlc<mjg> g;

    private mjn(wlc<ovb> wlc, wlc<a> wlc2, wlc<a> wlc3, wlc<mjk> wlc4, wlc<mjd> wlc5, wlc<mjw> wlc6, wlc<mjg> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static mjn a(wlc<ovb> wlc, wlc<a> wlc2, wlc<a> wlc3, wlc<mjk> wlc4, wlc<mjd> wlc5, wlc<mjw> wlc6, wlc<mjg> wlc7) {
        mjn mjn = new mjn(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return mjn;
    }

    public final /* synthetic */ Object get() {
        mjm mjm = new mjm((ovb) this.a.get(), (a) this.b.get(), (a) this.c.get(), (mjk) this.d.get(), (mjd) this.e.get(), (mjw) this.f.get(), (mjg) this.g.get());
        return mjm;
    }
}
