package defpackage;

/* renamed from: nty reason: default package */
public final class nty implements a {
    private final wlc<ood> a;
    private final wlc<a<ooa>> b;
    private final wlc<oob> c;

    public nty(wlc<ood> wlc, wlc<a<ooa>> wlc2, wlc<oob> wlc3) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
    }

    public final ntx a(tke tke, vti<jmf<ooa>> vti) {
        ntx ntx = new ntx((ood) a((T) this.a.get(), 1), (a) a((T) this.b.get(), 2), (oob) a((T) this.c.get(), 3), (tke) a((T) tke, 4), (vti) a((T) vti, 5));
        return ntx;
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
