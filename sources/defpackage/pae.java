package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: pae reason: default package */
final class pae implements a {
    private final wzi<pag> a;
    private final wzi<Context> b;
    private final wzi<Picasso> c;
    private final wzi<omc> d;
    private final wzi<oml> e;
    private final wzi<ozz> f;

    pae(wzi<pag> wzi, wzi<Context> wzi2, wzi<Picasso> wzi3, wzi<omc> wzi4, wzi<oml> wzi5, wzi<ozz> wzi6) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ pab a() {
        pad pad = new pad((pag) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (Picasso) a(this.c.get(), 3), (omc) a(this.d.get(), 4), (oml) a(this.e.get(), 5), (ozz) a(this.f.get(), 6));
        return pad;
    }
}
