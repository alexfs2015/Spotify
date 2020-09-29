package defpackage;

import android.view.LayoutInflater;

/* renamed from: tpd reason: default package */
public final class tpd {
    final wzi<LayoutInflater> a;
    final wzi<Integer> b;

    public tpd(wzi<LayoutInflater> wzi, wzi<Integer> wzi2) {
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
