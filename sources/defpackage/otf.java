package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.squareup.picasso.Picasso;

/* renamed from: otf reason: default package */
final class otf implements a {
    private final wzi<Picasso> a;
    private final wzi<Context> b;
    private final wzi<osx> c;
    private final wzi<a> d;
    private final wzi<jtz> e;
    private final wzi<osx> f;

    otf(wzi<Picasso> wzi, wzi<Context> wzi2, wzi<osx> wzi3, wzi<a> wzi4, wzi<jtz> wzi5, wzi<osx> wzi6) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
        this.d = (wzi) a((T) wzi4, 4);
        this.e = (wzi) a((T) wzi5, 5);
        this.f = (wzi) a((T) wzi6, 6);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ otc a(ook ook) {
        ote ote = new ote((Picasso) a((T) this.a.get(), 1), (Context) a((T) this.b.get(), 2), (osx) a((T) this.c.get(), 3), (a) a((T) this.d.get(), 4), (jtz) a((T) this.e.get(), 5), (ook) a((T) ook, 6));
        return ote;
    }

    public final /* synthetic */ otc a(ook ook, Optional optional) {
        ote ote = new ote((Picasso) a((T) this.a.get(), 1), (Context) a((T) this.b.get(), 2), (osx) a((T) this.f.get(), 3), (a) a((T) this.d.get(), 4), (jtz) a((T) this.e.get(), 5), (ook) a((T) ook, 6), (Optional) a((T) optional, 7));
        return ote;
    }
}
