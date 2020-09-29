package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ltv reason: default package */
public final class ltv {
    public final wlc<Context> a;
    public final wlc<lui> b;
    public final wlc<ltz> c;
    public final wlc<heg> d;
    public final wlc<Picasso> e;
    public final wlc<ltx> f;

    public ltv(wlc<Context> wlc, wlc<lui> wlc2, wlc<ltz> wlc3, wlc<heg> wlc4, wlc<Picasso> wlc5, wlc<ltx> wlc6) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
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
