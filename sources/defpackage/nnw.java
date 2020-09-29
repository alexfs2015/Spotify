package defpackage;

/* renamed from: nnw reason: default package */
public final class nnw {
    final wlc<nnp> a;

    public nnw(wlc<nnp> wlc) {
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
