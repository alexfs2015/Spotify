package defpackage;

/* renamed from: mjg reason: default package */
public final class mjg {
    final wlc<mji> a;
    final wlc<String> b;

    public mjg(wlc<mji> wlc, wlc<String> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
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
