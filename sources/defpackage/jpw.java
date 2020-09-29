package defpackage;

/* renamed from: jpw reason: default package */
public final class jpw {
    public static jpv a(jst jst, fpt fpt, String str) {
        return new jpv((jst) a(jst, 1), (fpt) a(fpt, 2), str);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
