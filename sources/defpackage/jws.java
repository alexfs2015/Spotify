package defpackage;

/* renamed from: jws reason: default package */
public final class jws {
    public static jwr a(int i, long j, a aVar) {
        return new jwr(0, 500, (a) a(aVar, 3));
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
