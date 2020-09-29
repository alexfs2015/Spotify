package defpackage;

/* renamed from: nuh reason: default package */
public final class nuh {
    final wzi<nue> a;

    public nuh(wzi<nue> wzi) {
        this.a = (wzi) a(wzi, 1);
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
