package defpackage;

/* renamed from: oop reason: default package */
public final class oop implements a {
    private final wlc<ofl> a;
    private final wlc<ood> b;
    private final wlc<a<ooa>> c;
    private final wlc<oob> d;
    private final wlc<tui> e;

    public oop(wlc<ofl> wlc, wlc<ood> wlc2, wlc<a<ooa>> wlc3, wlc<oob> wlc4, wlc<tui> wlc5) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
        this.e = (wlc) a((T) wlc5, 5);
    }

    public final ooo a(tke tke, vti<jmf<ooa>> vti) {
        ooo ooo = new ooo((ofl) a((T) this.a.get(), 1), (ood) a((T) this.b.get(), 2), (a) a((T) this.c.get(), 3), (oob) a((T) this.d.get(), 4), (tui) a((T) this.e.get(), 5), (tke) a((T) tke, 6), (vti) a((T) vti, 7));
        return ooo;
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
