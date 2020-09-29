package defpackage;

/* renamed from: onn reason: default package */
public final class onn {
    private final wlc<opb> a;

    public onn(wlc<opb> wlc) {
        this.a = (wlc) a(wlc, 1);
    }

    public final onp a(gjf gjf) {
        return new onp((opb) a(this.a.get(), 1), (gjf) a(gjf, 2));
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
