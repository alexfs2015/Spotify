package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: nrc reason: default package */
public final class nrc {
    final wzi<Picasso> a;

    public nrc(wzi<Picasso> wzi) {
        this.a = (wzi) a(wzi, 1);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
