package defpackage;

/* renamed from: oxy reason: default package */
public final class oxy implements a {
    private final wzi<tmu> a;
    private final wzi<ozk> b;
    private final wzi<oya> c;

    public oxy(wzi<tmu> wzi, wzi<ozk> wzi2, wzi<oya> wzi3) {
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

    public final /* synthetic */ oxw a(oyl oyl) {
        return new oxx((tmu) a(this.a.get(), 1), (ozk) a(this.b.get(), 2), (oya) a(this.c.get(), 3), (oyl) a(oyl, 4));
    }
}
