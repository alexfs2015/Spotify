package defpackage;

/* renamed from: ihf reason: default package */
public final class ihf {
    final wzi<ihc> a;
    final wzi<ibr> b;
    final wzi<iam> c;

    public ihf(wzi<ihc> wzi, wzi<ibr> wzi2, wzi<iam> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
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
