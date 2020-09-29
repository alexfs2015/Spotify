package defpackage;

/* renamed from: ies reason: default package */
public final class ies {
    final wlc<iep> a;
    final wlc<hzf> b;
    final wlc<hya> c;

    public ies(wlc<iep> wlc, wlc<hzf> wlc2, wlc<hya> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
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
