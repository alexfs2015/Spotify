package defpackage;

/* renamed from: tai reason: default package */
public final class tai {
    private final wlc<urn> a;
    private final wlc<tbk> b;

    public tai(wlc<urn> wlc, wlc<tbk> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
    }

    public final tah a(tak tak) {
        return new tah((tak) a(tak, 1), (urn) a(this.a.get(), 2), this.b);
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
