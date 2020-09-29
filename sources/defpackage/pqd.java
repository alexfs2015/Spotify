package defpackage;

import android.content.Context;

/* renamed from: pqd reason: default package */
public final class pqd {
    final wzi<pqz> a;
    final wzi<Context> b;

    public pqd(wzi<pqz> wzi, wzi<Context> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
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
