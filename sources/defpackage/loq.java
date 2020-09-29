package defpackage;

/* renamed from: loq reason: default package */
public final class loq {
    public final wzi<jlr> a;
    public final wzi<jtz> b;

    loq(wzi<jlr> wzi, wzi<jtz> wzi2) {
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
