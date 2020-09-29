package defpackage;

/* renamed from: mnz reason: default package */
public final class mnz {
    final wzi<mob> a;
    final wzi<String> b;

    public mnz(wzi<mob> wzi, wzi<String> wzi2) {
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
