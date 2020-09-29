package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: lxw reason: default package */
public final class lxw {
    final wzi<Picasso> a;
    final wzi<hhc> b;

    public lxw(wzi<Picasso> wzi, wzi<hhc> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
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
