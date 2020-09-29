package defpackage;

/* renamed from: rcu reason: default package */
public final class rcu {
    private final wzi<rbg> a;
    private final wzi<iqv> b;
    private final wzi<rgf> c;

    public rcu(wzi<rbg> wzi, wzi<iqv> wzi2, wzi<rgf> wzi3) {
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

    public final rct a(a aVar) {
        return new rct((a) a(aVar, 1), (rbg) a(this.a.get(), 2), (iqv) a(this.b.get(), 3), (rgf) a(this.c.get(), 4));
    }
}
