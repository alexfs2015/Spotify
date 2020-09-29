package defpackage;

/* renamed from: mwn reason: default package */
public final class mwn {
    final wlc<ims> a;
    final wlc<mwr> b;

    public mwn(wlc<ims> wlc, wlc<mwr> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
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
