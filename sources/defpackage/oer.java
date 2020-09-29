package defpackage;

import android.content.res.Resources;

/* renamed from: oer reason: default package */
public final class oer {
    public final wzi<Resources> a;
    public final wzi<kbd> b;
    public final wzi<oes> c;
    public final wzi<oel> d;

    public oer(wzi<Resources> wzi, wzi<kbd> wzi2, wzi<oes> wzi3, wzi<oel> wzi4) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
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
