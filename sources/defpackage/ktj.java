package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ktj reason: default package */
final class ktj {
    final wzi<Context> a;
    final wzi<Picasso> b;

    ktj(wzi<Context> wzi, wzi<Picasso> wzi2) {
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
