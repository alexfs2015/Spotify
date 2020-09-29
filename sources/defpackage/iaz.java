package defpackage;

/* renamed from: iaz reason: default package */
public final class iaz {
    public final wlc<ias> a;
    public final wlc<hzr> b;
    public final wlc<iax> c;

    public iaz(wlc<ias> wlc, wlc<hzr> wlc2, wlc<iax> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
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
