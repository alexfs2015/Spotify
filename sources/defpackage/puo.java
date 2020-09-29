package defpackage;

/* renamed from: puo reason: default package */
public final class puo {
    public final wzi<gto> a;
    public final wzi<fqn> b;

    public puo(wzi<gto> wzi, wzi<fqn> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
