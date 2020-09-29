package defpackage;

/* renamed from: hqj reason: default package */
public final class hqj implements vua<hqi> {
    private final wlc<hsg> a;
    private final wlc<hpg> b;
    private final wlc<jro> c;
    private final wlc<jrf> d;
    private final wlc<hox> e;

    private hqj(wlc<hsg> wlc, wlc<hpg> wlc2, wlc<jro> wlc3, wlc<jrf> wlc4, wlc<hox> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hqj a(wlc<hsg> wlc, wlc<hpg> wlc2, wlc<jro> wlc3, wlc<jrf> wlc4, wlc<hox> wlc5) {
        hqj hqj = new hqj(wlc, wlc2, wlc3, wlc4, wlc5);
        return hqj;
    }

    public final /* synthetic */ Object get() {
        hqi hqi = new hqi((hsg) this.a.get(), (hpg) this.b.get(), (jro) this.c.get(), (jrf) this.d.get(), (hox) this.e.get());
        return hqi;
    }
}
