package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: oue reason: default package */
final class oue implements a {
    private final wlc<Picasso> a;
    private final wlc<Context> b;
    private final wlc<otz> c;
    private final wlc<jxn> d;

    oue(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<otz> wlc3, wlc<jxn> wlc4) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oub a(otr otr, fpt fpt) {
        oud oud = new oud((Picasso) a((T) this.a.get(), 1), (Context) a((T) this.b.get(), 2), (otz) a((T) this.c.get(), 3), (jxn) a((T) this.d.get(), 4), (otr) a((T) otr, 5), (fpt) a((T) fpt, 6));
        return oud;
    }
}
