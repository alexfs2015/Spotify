package defpackage;

import android.content.Context;

/* renamed from: opp reason: default package */
final class opp implements a {
    private final wlc<gut> a;
    private final wlc<opi> b;
    private final wlc<udr> c;
    private final wlc<Context> d;
    private final wlc<gum> e;

    opp(wlc<gut> wlc, wlc<opi> wlc2, wlc<udr> wlc3, wlc<Context> wlc4, wlc<gum> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ opm a() {
        opo opo = new opo((gut) a(this.a.get(), 1), (opi) a(this.b.get(), 2), (udr) a(this.c.get(), 3), (Context) a(this.d.get(), 4), (gum) a(this.e.get(), 5));
        return opo;
    }
}
