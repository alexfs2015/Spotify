package defpackage;

/* renamed from: saf reason: default package */
public final class saf implements vua<sae> {
    private final wlc<saa> a;
    private final wlc<rzo> b;

    private saf(wlc<saa> wlc, wlc<rzo> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static saf a(wlc<saa> wlc, wlc<rzo> wlc2) {
        return new saf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new sae((saa) this.a.get(), (rzo) this.b.get());
    }
}
