package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: orv reason: default package */
final class orv implements a {
    private final wzi<Context> a;
    private final wzi<Picasso> b;
    private final wzi<orq> c;

    orv(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<orq> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ ors a(ooe ooe) {
        return new oru((Context) a(this.a.get(), 1), (Picasso) a(this.b.get(), 2), (orq) a(this.c.get(), 3), (ooe) a(ooe, 4));
    }
}
