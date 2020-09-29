package defpackage;

/* renamed from: icw reason: default package */
public final class icw {
    final wzi<ide> a;
    final wzi<jvf> b;

    public icw(wzi<ide> wzi, wzi<jvf> wzi2) {
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
