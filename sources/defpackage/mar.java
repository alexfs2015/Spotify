package defpackage;

import android.content.Context;

/* renamed from: mar reason: default package */
public final class mar implements a {
    private final wlc<Context> a;
    private final wlc<ood> b;
    private final wlc<a<ooa>> c;
    private final wlc<oob> d;

    public mar(wlc<Context> wlc, wlc<ood> wlc2, wlc<a<ooa>> wlc3, wlc<oob> wlc4) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
    }

    public final maq a(tke tke, vti<jmf<ooa>> vti) {
        maq maq = new maq((Context) a((T) this.a.get(), 1), (ood) a((T) this.b.get(), 2), (a) a((T) this.c.get(), 3), (oob) a((T) this.d.get(), 4), (tke) a((T) tke, 5), (vti) a((T) vti, 6));
        return maq;
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
