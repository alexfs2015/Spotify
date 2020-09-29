package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: pbp reason: default package */
final class pbp implements a {
    private final wzi<Picasso> a;
    private final wzi<Context> b;
    private final wzi<pbk> c;
    private final wzi<jzn> d;
    private final wzi<a> e;

    pbp(wzi<Picasso> wzi, wzi<Context> wzi2, wzi<pbk> wzi3, wzi<jzn> wzi4, wzi<a> wzi5) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
        this.d = (wzi) a((T) wzi4, 4);
        this.e = (wzi) a((T) wzi5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ pbm a(pbc pbc, fqn fqn) {
        pbo pbo = new pbo((Picasso) a((T) this.a.get(), 1), (Context) a((T) this.b.get(), 2), (pbk) a((T) this.c.get(), 3), (jzn) a((T) this.d.get(), 4), (a) a((T) this.e.get(), 5), (pbc) a((T) pbc, 6), (fqn) a((T) fqn, 7));
        return pbo;
    }
}
