package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ong reason: default package */
final class ong implements a {
    private final wlc<Picasso> a;
    private final wlc<Context> b;
    private final wlc<onb> c;
    private final wlc<a> d;
    private final wlc<onb> e;

    ong(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<onb> wlc3, wlc<a> wlc4, wlc<onb> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ ond a(ohh ohh) {
        onf onf = new onf((Picasso) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (onb) a(this.c.get(), 3), (a) a(this.d.get(), 4), (ohh) a(ohh, 5));
        return onf;
    }
}
