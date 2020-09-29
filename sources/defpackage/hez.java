package defpackage;

import android.app.Activity;

/* renamed from: hez reason: default package */
public final class hez {
    public final wzi<Activity> a;
    public final wzi<sso> b;
    public final wzi<fqn> c;
    public final wzi<Integer> d;
    public final wzi<jpc> e;

    hez(wzi<Activity> wzi, wzi<sso> wzi2, wzi<fqn> wzi3, wzi<Integer> wzi4, wzi<jpc> wzi5) {
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
