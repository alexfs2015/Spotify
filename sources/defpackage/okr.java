package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: okr reason: default package */
final class okr implements a {
    private final wlc<Context> a;
    private final wlc<Picasso> b;
    private final wlc<okm> c;

    okr(wlc<Context> wlc, wlc<Picasso> wlc2, wlc<okm> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oko a(oha oha) {
        return new okq((Context) a(this.a.get(), 1), (Picasso) a(this.b.get(), 2), (okm) a(this.c.get(), 3), (oha) a(oha, 4));
    }
}
