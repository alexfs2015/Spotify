package defpackage;

/* renamed from: pcv reason: default package */
public final class pcv implements vua<pcu> {
    private final wlc<pct> a;
    private final wlc<pcy> b;
    private final wlc<jrp> c;
    private final wlc<jro> d;
    private final wlc<String> e;

    private pcv(wlc<pct> wlc, wlc<pcy> wlc2, wlc<jrp> wlc3, wlc<jro> wlc4, wlc<String> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static pcv a(wlc<pct> wlc, wlc<pcy> wlc2, wlc<jrp> wlc3, wlc<jro> wlc4, wlc<String> wlc5) {
        pcv pcv = new pcv(wlc, wlc2, wlc3, wlc4, wlc5);
        return pcv;
    }

    public final /* synthetic */ Object get() {
        pcu pcu = new pcu((pct) this.a.get(), (pcy) this.b.get(), (jrp) this.c.get(), (jro) this.d.get(), (String) this.e.get());
        return pcu;
    }
}
