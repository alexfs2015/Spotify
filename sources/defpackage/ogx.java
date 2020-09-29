package defpackage;

import android.content.Context;

/* renamed from: ogx reason: default package */
public final class ogx {
    public final wzi<Context> a;
    public final wzi<jty> b;
    public final wzi<ogy> c;
    public final wzi<hgz> d;
    public final wzi<hxx> e;

    public ogx(wzi<Context> wzi, wzi<jty> wzi2, wzi<ogy> wzi3, wzi<hgz> wzi4, wzi<hxx> wzi5) {
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
