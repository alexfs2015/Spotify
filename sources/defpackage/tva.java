package defpackage;

/* renamed from: tva reason: default package */
final class tva {
    final wzi<a> a;
    final wzi<hhc> b;
    final wzi<a> c;
    final wzi<rkc> d;
    final wzi<String> e;

    tva(wzi<a> wzi, wzi<hhc> wzi2, wzi<a> wzi3, wzi<rkc> wzi4, wzi<String> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
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
