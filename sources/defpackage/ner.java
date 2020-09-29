package defpackage;

/* renamed from: ner reason: default package */
public final class ner implements vua<neq> {
    private final wlc<fpt> a;
    private final wlc<hdf> b;
    private final wlc<tjv> c;

    private ner(wlc<fpt> wlc, wlc<hdf> wlc2, wlc<tjv> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ner a(wlc<fpt> wlc, wlc<hdf> wlc2, wlc<tjv> wlc3) {
        return new ner(wlc, wlc2, wlc3);
    }

    public static neq a(fpt fpt, hdf hdf, tjv tjv) {
        return new neq(fpt, hdf, tjv);
    }

    public final /* synthetic */ Object get() {
        return new neq((fpt) this.a.get(), (hdf) this.b.get(), (tjv) this.c.get());
    }
}
