package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: nri reason: default package */
public final class nri {
    public final wzi<nre> a;
    public final wzi<Picasso> b;

    public nri(wzi<nre> wzi, wzi<Picasso> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
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
