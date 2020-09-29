package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: umn reason: default package */
public final class umn {
    public final wzi<Picasso> a;
    public final wzi<xir> b;

    public umn(wzi<Picasso> wzi, wzi<xir> wzi2) {
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
