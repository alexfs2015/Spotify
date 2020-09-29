package defpackage;

/* renamed from: out reason: default package */
public final class out {
    private final wzi<owh> a;

    public out(wzi<owh> wzi) {
        this.a = (wzi) a(wzi, 1);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final ouv a(gkq gkq) {
        return new ouv((owh) a(this.a.get(), 1), (gkq) a(gkq, 2));
    }
}
