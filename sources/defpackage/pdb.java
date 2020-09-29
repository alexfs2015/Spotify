package defpackage;

import android.content.Context;

/* renamed from: pdb reason: default package */
final class pdb implements a {
    private final wzi<pcv> a;
    private final wzi<Context> b;
    private final wzi<pco> c;

    pdb(wzi<pcv> wzi, wzi<Context> wzi2, wzi<pco> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ pcy a(oop oop) {
        return new pda((pcv) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (pco) a(this.c.get(), 3), (oop) a(oop, 4));
    }
}
