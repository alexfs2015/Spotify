package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: tzv reason: default package */
public final class tzv {
    public final wlc<Picasso> a;
    public final wlc<wum> b;
    public final wlc<tzp> c;

    public tzv(wlc<Picasso> wlc, wlc<wum> wlc2, wlc<tzp> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
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
