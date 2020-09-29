package defpackage;

/* renamed from: rzu reason: default package */
public final class rzu implements vua<rzt> {
    private final wlc<sag> a;
    private final wlc<sac> b;
    private final wlc<sae> c;
    private final wlc<rzh> d;
    private final wlc<saa> e;
    private final wlc<Integer> f;

    private rzu(wlc<sag> wlc, wlc<sac> wlc2, wlc<sae> wlc3, wlc<rzh> wlc4, wlc<saa> wlc5, wlc<Integer> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static rzu a(wlc<sag> wlc, wlc<sac> wlc2, wlc<sae> wlc3, wlc<rzh> wlc4, wlc<saa> wlc5, wlc<Integer> wlc6) {
        rzu rzu = new rzu(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return rzu;
    }

    public final /* synthetic */ Object get() {
        rzt rzt = new rzt((sag) this.a.get(), (sac) this.b.get(), (sae) this.c.get(), (rzh) this.d.get(), (saa) this.e.get(), ((Integer) this.f.get()).intValue());
        return rzt;
    }
}
