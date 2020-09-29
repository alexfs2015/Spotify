package defpackage;

import android.content.Context;

/* renamed from: rbd reason: default package */
public final class rbd {
    public final wzi<Context> a;
    public final wzi<qzz> b;
    public final wzi<rax> c;
    public final wzi<ras> d;
    public final wzi<rap> e;
    public final wzi<raz> f;
    public final wzi<qzx> g;

    public rbd(wzi<Context> wzi, wzi<qzz> wzi2, wzi<rax> wzi3, wzi<ras> wzi4, wzi<rap> wzi5, wzi<raz> wzi6, wzi<qzx> wzi7) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
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
