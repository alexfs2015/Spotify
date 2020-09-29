package defpackage;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: tiq reason: default package */
public final class tiq {
    private final wzi<LayoutInflater> a;
    private final wzi<Integer> b;
    private final wzi<vgw> c;
    private final wzi<DisplayMetrics> d;

    public tiq(wzi<LayoutInflater> wzi, wzi<Integer> wzi2, wzi<vgw> wzi3, wzi<DisplayMetrics> wzi4) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final tip a(ViewGroup viewGroup) {
        tip tip = new tip((LayoutInflater) a(this.a.get(), 1), ((Integer) a(this.b.get(), 2)).intValue(), (vgw) a(this.c.get(), 3), (DisplayMetrics) a(this.d.get(), 4), (ViewGroup) a(viewGroup, 5));
        return tip;
    }
}
