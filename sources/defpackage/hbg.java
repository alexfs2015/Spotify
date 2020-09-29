package defpackage;

/* renamed from: hbg reason: default package */
public final class hbg {
    private final wlc<uxc> a;

    public hbg(wlc<uxc> wlc) {
        this.a = (wlc) a(wlc, 1);
    }

    public final hbf a(String str) {
        return new hbf((uxc) a(this.a.get(), 1), (String) a(str, 2));
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
