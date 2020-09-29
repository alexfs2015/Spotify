package defpackage;

/* renamed from: osd reason: default package */
final class osd implements a {
    private final wzi<ory> a;
    private final wzi<oml> b;

    osd(wzi<ory> wzi, wzi<oml> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ osa a(gkq gkq) {
        return new osc((ory) a(this.a.get(), 1), (oml) a(this.b.get(), 2), (gkq) a(gkq, 3));
    }
}
