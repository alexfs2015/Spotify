package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: nln reason: default package */
public final class nln {
    final wlc<Picasso> a;

    public nln(wlc<Picasso> wlc) {
        this.a = (wlc) a(wlc, 1);
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
