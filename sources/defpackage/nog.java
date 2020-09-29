package defpackage;

/* renamed from: nog reason: default package */
public final class nog {
    final wlc<nod> a;

    public nog(wlc<nod> wlc) {
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
