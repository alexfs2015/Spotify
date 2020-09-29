package defpackage;

/* renamed from: nbq reason: default package */
public final class nbq {
    final wzi<ipf> a;
    final wzi<nbu> b;

    public nbq(wzi<ipf> wzi, wzi<nbu> wzi2) {
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
