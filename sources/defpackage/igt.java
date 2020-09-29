package defpackage;

/* renamed from: igt reason: default package */
public final class igt {
    public final wzi<ihc> a;
    public final wzi<ihf> b;
    public final wzi<tmu> c;
    public final wzi<ibn> d;

    public igt(wzi<ihc> wzi, wzi<ihf> wzi2, wzi<tmu> wzi3, wzi<ibn> wzi4) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
