package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.squareup.picasso.Picasso;

/* renamed from: omb reason: default package */
final class omb implements a {
    private final wlc<Picasso> a;
    private final wlc<Context> b;
    private final wlc<olt> c;
    private final wlc<a> d;
    private final wlc<olt> e;

    omb(wlc<Picasso> wlc, wlc<Context> wlc2, wlc<olt> wlc3, wlc<a> wlc4, wlc<olt> wlc5) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
        this.c = (wlc) a((T) wlc3, 3);
        this.d = (wlc) a((T) wlc4, 4);
        this.e = (wlc) a((T) wlc5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oly a(ohg ohg, Optional optional) {
        oma oma = new oma((Picasso) a((T) this.a.get(), 1), (Context) a((T) this.b.get(), 2), (olt) a((T) this.e.get(), 3), (a) a((T) this.d.get(), 4), (ohg) a((T) ohg, 5), (Optional) a((T) optional, 6));
        return oma;
    }

    public final /* synthetic */ oly a(ohg ohg) {
        oma oma = new oma((Picasso) a((T) this.a.get(), 1), (Context) a((T) this.b.get(), 2), (olt) a((T) this.c.get(), 3), (a) a((T) this.d.get(), 4), (ohg) a((T) ohg, 5));
        return oma;
    }
}
