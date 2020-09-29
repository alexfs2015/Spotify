package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ouk reason: default package */
final class ouk implements a {
    private final wzi<Picasso> a;
    private final wzi<Context> b;
    private final wzi<ouf> c;
    private final wzi<a> d;
    private final wzi<ouf> e;

    ouk(wzi<Picasso> wzi, wzi<Context> wzi2, wzi<ouf> wzi3, wzi<a> wzi4, wzi<ouf> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ ouh a(ool ool) {
        ouj ouj = new ouj((Picasso) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (ouf) a(this.c.get(), 3), (a) a(this.d.get(), 4), (ool) a(ool, 5));
        return ouj;
    }
}
