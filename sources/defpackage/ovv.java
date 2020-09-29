package defpackage;

/* renamed from: ovv reason: default package */
public final class ovv implements a {
    private final wzi<omp> a;
    private final wzi<ovj> b;
    private final wzi<a<ovg>> c;
    private final wzi<ovh> d;
    private final wzi<ugl> e;

    public ovv(wzi<omp> wzi, wzi<ovj> wzi2, wzi<a<ovg>> wzi3, wzi<ovh> wzi4, wzi<ugl> wzi5) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
        this.d = (wzi) a((T) wzi4, 4);
        this.e = (wzi) a((T) wzi5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final ovu a(tvw tvw, who<jor<ovg>> who) {
        ovu ovu = new ovu((omp) a((T) this.a.get(), 1), (ovj) a((T) this.b.get(), 2), (a) a((T) this.c.get(), 3), (ovh) a((T) this.d.get(), 4), (ugl) a((T) this.e.get(), 5), (tvw) a((T) tvw, 6), (who) a((T) who, 7));
        return ovu;
    }
}
