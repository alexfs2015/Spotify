package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: oxz reason: default package */
public final class oxz {
    public final wlc<Picasso> a;
    public final wlc<oxu> b;

    public oxz(wlc<Picasso> wlc, wlc<oxu> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
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
