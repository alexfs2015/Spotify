package defpackage;

/* renamed from: puh reason: default package */
public final class puh {
    public final wzi<pue> a;
    public final wzi<pvi> b;
    public final wzi<pvc> c;
    public final wzi<hgy> d;
    public final wzi<lon> e;

    public puh(wzi<pue> wzi, wzi<pvi> wzi2, wzi<pvc> wzi3, wzi<hgy> wzi4, wzi<lon> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
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
