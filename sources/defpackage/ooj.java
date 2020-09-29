package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: ooj reason: default package */
public final class ooj implements a {
    private final wlc<Picasso> a;
    private final wlc<ool> b;
    private final wlc<a<ooa>> c;
    private final wlc<oob> d;
    private final wlc<ood> e;
    private final wlc<ofl> f;
    private final wlc<tui> g;

    public ooj(wlc<Picasso> wlc, wlc<ool> wlc2, wlc<a<ooa>> wlc3, wlc<oob> wlc4, wlc<ood> wlc5, wlc<ofl> wlc6, wlc<tui> wlc7) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
        this.e = (wlc) a((T) wlc5, 5);
        this.f = (wlc) a((T) wlc6, 6);
        this.g = (wlc) a((T) wlc7, 7);
    }

    public final ooi a(tke tke, vti<jmf<ooa>> vti) {
        ooi ooi = new ooi((Picasso) a((T) this.a.get(), 1), (ool) a((T) this.b.get(), 2), (a) a((T) this.c.get(), 3), (oob) a((T) this.d.get(), 4), (ood) a((T) this.e.get(), 5), (ofl) a((T) this.f.get(), 6), (tui) a((T) this.g.get(), 7), (tke) a((T) tke, 8), (vti) a((T) vti, 9));
        return ooi;
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
