package defpackage;

import android.view.LayoutInflater;

/* renamed from: syl reason: default package */
public final class syl {
    public final wlc<LayoutInflater> a;
    public final wlc<Integer> b;
    public final wlc<uvf> c;
    public final wlc<jzd> d;

    public syl(wlc<LayoutInflater> wlc, wlc<Integer> wlc2, wlc<uvf> wlc3, wlc<jzd> wlc4) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
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
