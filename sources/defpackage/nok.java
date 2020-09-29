package defpackage;

/* renamed from: nok reason: default package */
public final class nok {
    final wlc<nog> a;

    public nok(wlc<nog> wlc) {
        this.a = (wlc) a(wlc, 1);
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
