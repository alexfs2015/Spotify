package defpackage;

/* renamed from: hdz reason: default package */
public final class hdz {
    private final wzi<vje> a;

    public hdz(wzi<vje> wzi) {
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

    public final hdy a(String str) {
        return new hdy((vje) a(this.a.get(), 1), (String) a(str, 2));
    }
}
