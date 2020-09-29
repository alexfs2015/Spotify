package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: kqa reason: default package */
final class kqa {
    final wlc<Context> a;
    final wlc<Picasso> b;

    kqa(wlc<Context> wlc, wlc<Picasso> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
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
