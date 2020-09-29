package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: nue reason: default package */
public final class nue {
    final wzi<Picasso> a;

    public nue(wzi<Picasso> wzi) {
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
