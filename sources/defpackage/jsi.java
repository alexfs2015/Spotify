package defpackage;

/* renamed from: jsi reason: default package */
public final class jsi {
    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public static jsh a(jva jva, fqn fqn, String str) {
        return new jsh((jva) a(jva, 1), (fqn) a(fqn, 2), str);
    }
}
