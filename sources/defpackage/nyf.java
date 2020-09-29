package defpackage;

import android.content.res.Resources;

/* renamed from: nyf reason: default package */
public final class nyf {
    public final wlc<Resources> a;
    public final wlc<jzd> b;
    public final wlc<nyg> c;

    public nyf(wlc<Resources> wlc, wlc<jzd> wlc2, wlc<nyg> wlc3) {
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
