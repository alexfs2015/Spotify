package defpackage;

/* renamed from: tve reason: default package */
public final class tve implements a {
    private final wzi<ovj> a;
    private final wzi<a<ovg>> b;
    private final wzi<ovh> c;
    private final wzi<tut> d;

    public tve(wzi<ovj> wzi, wzi<a<ovg>> wzi2, wzi<ovh> wzi3, wzi<tut> wzi4) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
        this.d = (wzi) a((T) wzi4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final tvd a(tvw tvw, who<jor<ovg>> who) {
        tvd tvd = new tvd((ovj) a((T) this.a.get(), 1), (a) a((T) this.b.get(), 2), (ovh) a((T) this.c.get(), 3), (tut) a((T) this.d.get(), 4), (tvw) a((T) tvw, 5), (who) a((T) who, 6));
        return tvd;
    }
}
