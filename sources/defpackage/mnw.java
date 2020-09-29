package defpackage;

import android.content.Context;

/* renamed from: mnw reason: default package */
public final class mnw {
    final wzi<mnr> a;
    final wzi<Context> b;
    final wzi<jlr> c;
    final wzi<jtz> d;
    final wzi<String> e;

    public mnw(wzi<mnr> wzi, wzi<Context> wzi2, wzi<jlr> wzi3, wzi<jtz> wzi4, wzi<String> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
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
