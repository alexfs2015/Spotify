package defpackage;

import android.content.Context;

/* renamed from: ryu reason: default package */
public final class ryu {
    public final wzi<Context> a;
    public final wzi<a> b;

    public ryu(wzi<Context> wzi, wzi<a> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
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
