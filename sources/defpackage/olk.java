package defpackage;

/* renamed from: olk reason: default package */
final class olk implements a {
    private final wlc<olf> a;
    private final wlc<rcd> b;
    private final wlc<ofh> c;
    private final wlc<ofj> d;

    olk(wlc<olf> wlc, wlc<rcd> wlc2, wlc<ofh> wlc3, wlc<ofj> wlc4) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ olh a(ohb ohb) {
        olf olf = (olf) a(this.a.get(), 1);
        rcd rcd = (rcd) a(this.b.get(), 2);
        ofh ofh = (ofh) a(this.c.get(), 3);
        ofj ofj = (ofj) a(this.d.get(), 4);
        a(ohb, 5);
        return new olj(olf, rcd, ofh, ofj);
    }
}
