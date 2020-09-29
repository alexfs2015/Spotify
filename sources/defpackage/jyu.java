package defpackage;

/* renamed from: jyu reason: default package */
public final class jyu {
    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public static jyt a(int i, long j, a aVar) {
        return new jyt(0, 500, (a) a(aVar, 3));
    }
}
