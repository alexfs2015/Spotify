package defpackage;

/* renamed from: tkp reason: default package */
public final class tkp {
    private final wzi<vcs> a;
    private final wzi<tlr> b;

    public tkp(wzi<vcs> wzi, wzi<tlr> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final tko a(tkr tkr) {
        return new tko((tkr) a(tkr, 1), (vcs) a(this.a.get(), 2), this.b);
    }
}
