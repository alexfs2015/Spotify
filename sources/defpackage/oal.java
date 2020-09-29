package defpackage;

/* renamed from: oal reason: default package */
public final class oal implements a {
    private final wzi<ovj> a;
    private final wzi<a<ovg>> b;
    private final wzi<ovh> c;

    public oal(wzi<ovj> wzi, wzi<a<ovg>> wzi2, wzi<ovh> wzi3) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final oak a(tvw tvw, who<jor<ovg>> who) {
        oak oak = new oak((ovj) a((T) this.a.get(), 1), (a) a((T) this.b.get(), 2), (ovh) a((T) this.c.get(), 3), (tvw) a((T) tvw, 4), (who) a((T) who, 5));
        return oak;
    }
}
