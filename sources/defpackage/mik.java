package defpackage;

import android.content.Context;

/* renamed from: mik reason: default package */
public final class mik {
    public final wzi<Context> a;
    public final wzi<sso> b;
    public final wzi<jyx> c;

    public mik(wzi<Context> wzi, wzi<sso> wzi2, wzi<jyx> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
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
