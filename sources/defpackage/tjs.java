package defpackage;

/* renamed from: tjs reason: default package */
public final class tjs implements a {
    private final wlc<ood> a;
    private final wlc<a<ooa>> b;
    private final wlc<oob> c;
    private final wlc<tjh> d;

    public tjs(wlc<ood> wlc, wlc<a<ooa>> wlc2, wlc<oob> wlc3, wlc<tjh> wlc4) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
    }

    public final tjr a(tke tke, vti<jmf<ooa>> vti) {
        tjr tjr = new tjr((ood) a((T) this.a.get(), 1), (a) a((T) this.b.get(), 2), (oob) a((T) this.c.get(), 3), (tjh) a((T) this.d.get(), 4), (tke) a((T) tke, 5), (vti) a((T) vti, 6));
        return tjr;
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
