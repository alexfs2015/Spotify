package defpackage;

/* renamed from: udl reason: default package */
public final class udl {
    public final wlc<ucu> a;
    public final wlc<uci> b;

    public udl(wlc<ucu> wlc, wlc<uci> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
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
