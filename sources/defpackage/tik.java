package defpackage;

import android.view.LayoutInflater;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.squareup.picasso.Picasso;

/* renamed from: tik reason: default package */
public final class tik {
    public final wzi<LayoutInflater> a;
    public final wzi<Integer> b;
    public final wzi<a> c;
    public final wzi<jzn> d;
    public final wzi<kad> e;
    public final wzi<kxz> f;
    public final wzi<kao> g;
    public final wzi<kye> h;
    public final wzi<kyg> i;
    public final wzi<Picasso> j;
    public final wzi<kyb> k;

    public tik(wzi<LayoutInflater> wzi, wzi<Integer> wzi2, wzi<a> wzi3, wzi<jzn> wzi4, wzi<kad> wzi5, wzi<kxz> wzi6, wzi<kao> wzi7, wzi<kye> wzi8, wzi<kyg> wzi9, wzi<Picasso> wzi10, wzi<kyb> wzi11) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
        this.h = (wzi) a(wzi8, 8);
        this.i = (wzi) a(wzi9, 9);
        this.j = (wzi) a(wzi10, 10);
        this.k = (wzi) a(wzi11, 11);
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
