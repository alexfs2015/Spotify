package defpackage;

/* renamed from: pcs reason: default package */
public final class pcs implements vua<pcr> {
    private final wlc<pcu> a;
    private final wlc<pdn> b;
    private final wlc<pdj> c;
    private final wlc<pdf> d;

    private pcs(wlc<pcu> wlc, wlc<pdn> wlc2, wlc<pdj> wlc3, wlc<pdf> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pcs a(wlc<pcu> wlc, wlc<pdn> wlc2, wlc<pdj> wlc3, wlc<pdf> wlc4) {
        return new pcs(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new pcr((pcu) this.a.get(), (pdn) this.b.get(), (pdj) this.c.get(), (pdf) this.d.get());
    }
}
