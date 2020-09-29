package defpackage;

/* renamed from: iri reason: default package */
public final class iri {
    private final wlc<gqw> a;
    private final wlc<klz> b;
    private final wlc<fpt> c;
    private final wlc<uav> d;
    private final wlc<ron> e;

    public iri(wlc<gqw> wlc, wlc<klz> wlc2, wlc<fpt> wlc3, wlc<uav> wlc4, wlc<ron> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
    }

    public final irh a(gse gse) {
        irh irh = new irh((gse) a(gse, 1), (gqw) a(this.a.get(), 2), (klz) a(this.b.get(), 3), (fpt) a(this.c.get(), 4), (uav) a(this.d.get(), 5), (ron) a(this.e.get(), 6));
        return irh;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
