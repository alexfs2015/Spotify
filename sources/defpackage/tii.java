package defpackage;

import android.view.LayoutInflater;
import com.squareup.picasso.Picasso;

/* renamed from: tii reason: default package */
public final class tii {
    public final wzi<LayoutInflater> a;
    public final wzi<Integer> b;
    public final wzi<kxz> c;
    public final wzi<Picasso> d;
    public final wzi<kye> e;
    public final wzi<kyg> f;

    public tii(wzi<LayoutInflater> wzi, wzi<Integer> wzi2, wzi<kxz> wzi3, wzi<Picasso> wzi4, wzi<kye> wzi5, wzi<kyg> wzi6) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
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
