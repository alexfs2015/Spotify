package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: omq reason: default package */
final class omq implements a {
    private final wlc<Picasso> a;
    private final wlc<Context> b;
    private final wlc<oml> c;
    private final wlc<a> d;

    omq(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<oml> wlc3, wlc<a> wlc4) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ omn a(ohc ohc) {
        omp omp = new omp((Picasso) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (oml) a(this.c.get(), 3), (a) a(this.d.get(), 4), (ohc) a(ohc, 5));
        return omp;
    }
}
