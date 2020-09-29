package defpackage;

/* renamed from: oyb reason: default package */
public final class oyb {
    private final wzi<owh> a;

    public oyb(wzi<owh> wzi) {
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

    public final oyd a(gkq gkq) {
        return new oyd((owh) a(this.a.get(), 1), (gkq) a(gkq, 2));
    }
}
