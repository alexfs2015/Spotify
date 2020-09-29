package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: lxu reason: default package */
public final class lxu {
    public final wzi<Context> a;
    public final wzi<lyh> b;
    public final wzi<lxy> c;
    public final wzi<hhc> d;
    public final wzi<Picasso> e;
    public final wzi<lxw> f;

    public lxu(wzi<Context> wzi, wzi<lyh> wzi2, wzi<lxy> wzi3, wzi<hhc> wzi4, wzi<Picasso> wzi5, wzi<lxw> wzi6) {
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
