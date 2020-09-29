package defpackage;

import android.view.LayoutInflater;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.squareup.picasso.Picasso;

/* renamed from: syd reason: default package */
public final class syd {
    public final wlc<LayoutInflater> a;
    public final wlc<Integer> b;
    public final wlc<a> c;
    public final wlc<jxn> d;
    public final wlc<jyd> e;
    public final wlc<kuq> f;
    public final wlc<jyo> g;
    public final wlc<kuv> h;
    public final wlc<kux> i;
    public final wlc<Picasso> j;
    public final wlc<kus> k;

    public syd(wlc<LayoutInflater> wlc, wlc<Integer> wlc2, wlc<a> wlc3, wlc<jxn> wlc4, wlc<jyd> wlc5, wlc<kuq> wlc6, wlc<jyo> wlc7, wlc<kuv> wlc8, wlc<kux> wlc9, wlc<Picasso> wlc10, wlc<kus> wlc11) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
        this.i = (wlc) a(wlc9, 9);
        this.j = (wlc) a(wlc10, 10);
        this.k = (wlc) a(wlc11, 11);
    }

    public static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}
