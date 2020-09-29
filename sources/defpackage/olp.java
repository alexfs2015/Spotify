package defpackage;

/* renamed from: olp reason: default package */
public final class olp {
    private final wlc<opb> a;

    public olp(wlc<opb> wlc) {
        this.a = (wlc) a(wlc, 1);
    }

    public final olr a(gjf gjf) {
        return new olr((opb) a(this.a.get(), 1), (gjf) a(gjf, 2));
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
