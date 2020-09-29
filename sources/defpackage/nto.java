package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: nto reason: default package */
public final class nto {
    final wzi<Picasso> a;

    public nto(wzi<Picasso> wzi) {
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
