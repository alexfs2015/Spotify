package defpackage;

import android.content.Context;

/* renamed from: rpk reason: default package */
public final class rpk {
    public final wlc<Context> a;
    public final wlc<a> b;

    public rpk(wlc<Context> wlc, wlc<a> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
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
