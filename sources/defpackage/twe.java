package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: twe reason: default package */
public final class twe<T> implements a<T> {
    private final wzi<Picasso> a;
    private final wzi<tvy> b;
    private final wzi<uia> c;
    private final wzi<uil> d;
    private final wzi<Boolean> e;
    private final wzi<tvr<T>> f;
    private final wzi<ujc> g;

    public twe(wzi<Picasso> wzi, wzi<tvy> wzi2, wzi<uia> wzi3, wzi<uil> wzi4, wzi<Boolean> wzi5, wzi<tvr<T>> wzi6, wzi<ujc> wzi7) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
        this.d = (wzi) a((T) wzi4, 4);
        this.e = (wzi) a((T) wzi5, 5);
        this.f = (wzi) a((T) wzi6, 6);
        this.g = (wzi) a((T) wzi7, 7);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ twc a(tvw tvw, who who) {
        twd twd = new twd((Picasso) a((T) this.a.get(), 1), (tvy) a((T) this.b.get(), 2), (uia) a((T) this.c.get(), 3), (uil) a((T) this.d.get(), 4), ((Boolean) a((T) this.e.get(), 5)).booleanValue(), (tvr) a((T) this.f.get(), 6), (ujc) a((T) this.g.get(), 7), (tvw) a((T) tvw, 8), (who) a((T) who, 9));
        return twd;
    }
}
