package defpackage;

/* renamed from: irj reason: default package */
public final class irj implements vua<iri> {
    private final wlc<gqw> a;
    private final wlc<klz> b;
    private final wlc<fpt> c;
    private final wlc<uav> d;
    private final wlc<ron> e;

    private irj(wlc<gqw> wlc, wlc<klz> wlc2, wlc<fpt> wlc3, wlc<uav> wlc4, wlc<ron> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static irj a(wlc<gqw> wlc, wlc<klz> wlc2, wlc<fpt> wlc3, wlc<uav> wlc4, wlc<ron> wlc5) {
        irj irj = new irj(wlc, wlc2, wlc3, wlc4, wlc5);
        return irj;
    }

    public final /* synthetic */ Object get() {
        iri iri = new iri(this.a, this.b, this.c, this.d, this.e);
        return iri;
    }
}
