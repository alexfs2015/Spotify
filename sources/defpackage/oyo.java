package defpackage;

/* renamed from: oyo reason: default package */
final class oyo implements a {
    private final wzi<oyg> a;
    private final wzi<oyj> b;

    oyo(wzi<oyg> wzi, wzi<oyj> wzi2) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oym a(opz opz, ooj ooj) {
        return new oyn((oyg) a((T) this.a.get(), 1), (oyj) a((T) this.b.get(), 2), (opz) a((T) opz, 3), (ooj) a((T) ooj, 4));
    }
}
