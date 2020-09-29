package defpackage;

/* renamed from: uqg reason: default package */
public final class uqg {
    public final wzi<upp> a;
    public final wzi<upd> b;

    public uqg(wzi<upp> wzi, wzi<upd> wzi2) {
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
