package defpackage;

/* renamed from: mmx reason: default package */
public final class mmx {
    private final wzi<gsv> a;
    private final wzi<unq> b;
    private final wzi<rxt> c;

    public mmx(wzi<gsv> wzi, wzi<unq> wzi2, wzi<rxt> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final mmw a(gue gue) {
        return new mmw((gue) a(gue, 1), (gsv) a(this.a.get(), 2), (unq) a(this.b.get(), 3), (rxt) a(this.c.get(), 4));
    }
}
