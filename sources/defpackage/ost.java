package defpackage;

/* renamed from: ost reason: default package */
public final class ost {
    private final wzi<owh> a;

    public ost(wzi<owh> wzi) {
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

    public final osv a(gkq gkq) {
        return new osv((owh) a(this.a.get(), 1), (gkq) a(gkq, 2));
    }
}
