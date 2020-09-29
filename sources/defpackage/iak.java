package defpackage;

/* renamed from: iak reason: default package */
public final class iak {
    final wlc<ias> a;
    final wlc<jsz> b;

    public iak(wlc<ias> wlc, wlc<jsz> wlc2) {
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
