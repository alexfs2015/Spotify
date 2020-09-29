package defpackage;

import android.content.Context;

/* renamed from: mjd reason: default package */
public final class mjd {
    final wlc<miy> a;
    final wlc<Context> b;
    final wlc<jjf> c;
    final wlc<jrp> d;
    final wlc<String> e;

    public mjd(wlc<miy> wlc, wlc<Context> wlc2, wlc<jjf> wlc3, wlc<jrp> wlc4, wlc<String> wlc5) {
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
