package defpackage;

import android.view.LayoutInflater;

/* renamed from: tis reason: default package */
public final class tis {
    public final wzi<LayoutInflater> a;
    public final wzi<Integer> b;
    public final wzi<vgw> c;
    public final wzi<kbd> d;

    public tis(wzi<LayoutInflater> wzi, wzi<Integer> wzi2, wzi<vgw> wzi3, wzi<kbd> wzi4) {
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
