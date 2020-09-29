package defpackage;

/* renamed from: qor reason: default package */
public final class qor {
    private final wlc<jrp> a;
    private final wlc<jjf> b;

    public qor(wlc<jrp> wlc, wlc<jjf> wlc2) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
    }

    public final qoq a(String str, String str2) {
        return new qoq((jrp) a((T) this.a.get(), 1), (jjf) a((T) this.b.get(), 2), (String) a((T) str, 3), (String) a((T) str2, 4));
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
