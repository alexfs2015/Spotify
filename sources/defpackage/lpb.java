package defpackage;

import android.content.Context;

/* renamed from: lpb reason: default package */
public final class lpb {
    final wlc<Context> a;
    final wlc<hec> b;
    final wlc<wug> c;
    final wlc<wug> d;
    final wlc<hrp> e;

    public lpb(wlc<Context> wlc, wlc<hec> wlc2, wlc<wug> wlc3, wlc<wug> wlc4, wlc<hrp> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
