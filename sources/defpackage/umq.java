package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: umq reason: default package */
public final class umq {
    public final wzi<Picasso> a;
    public final wzi<xir> b;
    public final wzi<umk> c;

    public umq(wzi<Picasso> wzi, wzi<xir> wzi2, wzi<umk> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
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
