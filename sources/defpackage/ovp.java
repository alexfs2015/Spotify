package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: ovp reason: default package */
public final class ovp implements a {
    private final wzi<Picasso> a;
    private final wzi<ovr> b;
    private final wzi<a<ovg>> c;
    private final wzi<ovh> d;
    private final wzi<ovj> e;
    private final wzi<omp> f;
    private final wzi<ugl> g;

    public ovp(wzi<Picasso> wzi, wzi<ovr> wzi2, wzi<a<ovg>> wzi3, wzi<ovh> wzi4, wzi<ovj> wzi5, wzi<omp> wzi6, wzi<ugl> wzi7) {
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

    public final ovo a(tvw tvw, who<jor<ovg>> who) {
        ovo ovo = new ovo((Picasso) a((T) this.a.get(), 1), (ovr) a((T) this.b.get(), 2), (a) a((T) this.c.get(), 3), (ovh) a((T) this.d.get(), 4), (ovj) a((T) this.e.get(), 5), (omp) a((T) this.f.get(), 6), (ugl) a((T) this.g.get(), 7), (tvw) a((T) tvw, 8), (who) a((T) who, 9));
        return ovo;
    }
}
