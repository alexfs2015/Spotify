package defpackage;

/* renamed from: oxg reason: default package */
public final class oxg implements vua<tun> {
    private final wlc<tuo> a;
    private final wlc<tmm> b;
    private final wlc<tlm> c;
    private final wlc<tlt> d;
    private final wlc<tlk> e;
    private final wlc<tlo> f;
    private final wlc<tlz> g;
    private final wlc<tlw> h;

    private oxg(wlc<tuo> wlc, wlc<tmm> wlc2, wlc<tlm> wlc3, wlc<tlt> wlc4, wlc<tlk> wlc5, wlc<tlo> wlc6, wlc<tlz> wlc7, wlc<tlw> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static oxg a(wlc<tuo> wlc, wlc<tmm> wlc2, wlc<tlm> wlc3, wlc<tlt> wlc4, wlc<tlk> wlc5, wlc<tlo> wlc6, wlc<tlz> wlc7, wlc<tlw> wlc8) {
        oxg oxg = new oxg(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return oxg;
    }

    public final /* synthetic */ Object get() {
        tuo tuo = (tuo) this.a.get();
        tlm tlm = (tlm) this.c.get();
        tlt tlt = (tlt) this.d.get();
        tlk tlk = (tlk) this.e.get();
        tlo tlo = (tlo) this.f.get();
        tlz tlz = (tlz) this.g.get();
        tlw tlw = (tlw) this.h.get();
        tuo.a(a.class, (tum) (tmm) this.b.get());
        tuo.a(a.class, (tum) tlm);
        tuo.a(a.class, (tum) tlk);
        tuo.a(a.class, (tum) new tlq());
        tuo.a(a.class, (tum) tlo);
        tuo.a(a.class, (tum) new tlr());
        tuo.a(a.class, (tum) tlt);
        tuo.a(a.class, (tum) tlz);
        tuo.a(a.class, (tum) new tls());
        tuo.a(a.class, (tum) tlw);
        return (tun) vuf.a(tuo, "Cannot return null from a non-@Nullable @Provides method");
    }
}
