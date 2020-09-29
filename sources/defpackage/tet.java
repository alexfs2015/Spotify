package defpackage;

import android.view.LayoutInflater;

/* renamed from: tet reason: default package */
public final class tet {
    final wlc<LayoutInflater> a;
    final wlc<Integer> b;

    public tet(wlc<LayoutInflater> wlc, wlc<Integer> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
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
