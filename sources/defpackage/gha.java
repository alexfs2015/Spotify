package defpackage;

/* renamed from: gha reason: default package */
public final class gha {
    public final wlc<gho> a;

    public gha(wlc<gho> wlc) {
        this.a = (wlc) a(wlc, 1);
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
