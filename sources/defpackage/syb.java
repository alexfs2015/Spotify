package defpackage;

import android.view.LayoutInflater;
import com.squareup.picasso.Picasso;

/* renamed from: syb reason: default package */
public final class syb {
    public final wlc<LayoutInflater> a;
    public final wlc<Integer> b;
    public final wlc<kuq> c;
    public final wlc<Picasso> d;
    public final wlc<kuv> e;
    public final wlc<kux> f;

    public syb(wlc<LayoutInflater> wlc, wlc<Integer> wlc2, wlc<kuq> wlc3, wlc<Picasso> wlc4, wlc<kuv> wlc5, wlc<kux> wlc6) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
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
