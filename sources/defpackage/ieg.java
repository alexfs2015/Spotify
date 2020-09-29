package defpackage;

/* renamed from: ieg reason: default package */
public final class ieg {
    public final wlc<iep> a;
    public final wlc<ies> b;
    public final wlc<tcn> c;
    public final wlc<hzb> d;

    public ieg(wlc<iep> wlc, wlc<ies> wlc2, wlc<tcn> wlc3, wlc<hzb> wlc4) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
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
