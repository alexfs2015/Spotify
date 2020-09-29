package defpackage;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: syj reason: default package */
public final class syj {
    private final wlc<LayoutInflater> a;
    private final wlc<Integer> b;
    private final wlc<uvf> c;
    private final wlc<DisplayMetrics> d;

    public syj(wlc<LayoutInflater> wlc, wlc<Integer> wlc2, wlc<uvf> wlc3, wlc<DisplayMetrics> wlc4) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
    }

    public final syi a(ViewGroup viewGroup) {
        syi syi = new syi((LayoutInflater) a(this.a.get(), 1), ((Integer) a(this.b.get(), 2)).intValue(), (uvf) a(this.c.get(), 3), (DisplayMetrics) a(this.d.get(), 4), (ViewGroup) a(viewGroup, 5));
        return syi;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
