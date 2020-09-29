package defpackage;

/* renamed from: qxa reason: default package */
public final class qxa {
    private final wzi<jtz> a;
    private final wzi<jlr> b;

    public qxa(wzi<jtz> wzi, wzi<jlr> wzi2) {
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

    public final qwz a(String str, String str2) {
        return new qwz((jtz) a((T) this.a.get(), 1), (jlr) a((T) this.b.get(), 2), (String) a((T) str, 3), (String) a((T) str2, 4));
    }
}
