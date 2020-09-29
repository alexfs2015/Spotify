package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: otu reason: default package */
final class otu implements a {
    private final wzi<Picasso> a;
    private final wzi<Context> b;
    private final wzi<otp> c;
    private final wzi<a> d;

    otu(wzi<Picasso> wzi, wzi<Context> wzi2, wzi<otp> wzi3, wzi<a> wzi4) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ otr a(oog oog) {
        ott ott = new ott((Picasso) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (otp) a(this.c.get(), 3), (a) a(this.d.get(), 4), (oog) a(oog, 5));
        return ott;
    }
}
