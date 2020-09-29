package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tzs reason: default package */
public final class tzs {
    public final wlc<Picasso> a;
    public final wlc<wum> b;

    public tzs(wlc<Picasso> wlc, wlc<wum> wlc2) {
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
