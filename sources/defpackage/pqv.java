package defpackage;

/* renamed from: pqv reason: default package */
public final class pqv {
    public final wzi<jyx> a;

    public pqv(wzi<jyx> wzi) {
        this.a = (wzi) a(wzi, 1);
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
