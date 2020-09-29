package defpackage;

import android.content.Context;

/* renamed from: meh reason: default package */
public final class meh {
    public final wlc<Context> a;
    public final wlc<sih> b;
    public final wlc<jwv> c;

    public meh(wlc<Context> wlc, wlc<sih> wlc2, wlc<jwv> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
