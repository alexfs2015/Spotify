package defpackage;

/* renamed from: mom reason: default package */
public final class mom {
    final wzi<a> a;
    final wzi<mnr> b;

    public mom(wzi<a> wzi, wzi<mnr> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
