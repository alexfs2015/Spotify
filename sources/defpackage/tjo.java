package defpackage;

/* renamed from: tjo reason: default package */
final class tjo {
    final wlc<a> a;
    final wlc<heg> b;
    final wlc<a> c;
    final wlc<rbg> d;
    final wlc<String> e;

    tjo(wlc<a> wlc, wlc<heg> wlc2, wlc<a> wlc3, wlc<rbg> wlc4, wlc<String> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
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
