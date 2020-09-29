package defpackage;

import android.content.Context;

/* renamed from: meu reason: default package */
public final class meu implements a {
    private final wzi<Context> a;
    private final wzi<ovj> b;
    private final wzi<a<ovg>> c;
    private final wzi<ovh> d;

    public meu(wzi<Context> wzi, wzi<ovj> wzi2, wzi<a<ovg>> wzi3, wzi<ovh> wzi4) {
        this.a = (wzi) a((T) wzi, 1);
        this.b = (wzi) a((T) wzi2, 2);
        this.c = (wzi) a((T) wzi3, 3);
        this.d = (wzi) a((T) wzi4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final met a(tvw tvw, who<jor<ovg>> who) {
        met met = new met((Context) a((T) this.a.get(), 1), (ovj) a((T) this.b.get(), 2), (a) a((T) this.c.get(), 3), (ovh) a((T) this.d.get(), 4), (tvw) a((T) tvw, 5), (who) a((T) who, 6));
        return met;
    }
}
