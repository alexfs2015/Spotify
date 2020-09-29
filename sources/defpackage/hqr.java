package defpackage;

/* renamed from: hqr reason: default package */
public final class hqr implements vua<hqq> {
    private final wlc<hsh> a;
    private final wlc<hpg> b;
    private final wlc<jro> c;
    private final wlc<jrf> d;
    private final wlc<hox> e;

    private hqr(wlc<hsh> wlc, wlc<hpg> wlc2, wlc<jro> wlc3, wlc<jrf> wlc4, wlc<hox> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hqr a(wlc<hsh> wlc, wlc<hpg> wlc2, wlc<jro> wlc3, wlc<jrf> wlc4, wlc<hox> wlc5) {
        hqr hqr = new hqr(wlc, wlc2, wlc3, wlc4, wlc5);
        return hqr;
    }

    public final /* synthetic */ Object get() {
        hqq hqq = new hqq((hsh) this.a.get(), (hpg) this.b.get(), (jro) this.c.get(), (jrf) this.d.get(), (hox) this.e.get());
        return hqq;
    }
}
