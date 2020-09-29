package defpackage;

import android.content.Context;

/* renamed from: owv reason: default package */
final class owv implements a {
    private final wzi<gwt> a;
    private final wzi<owo> b;
    private final wzi<uqm> c;
    private final wzi<Context> d;
    private final wzi<gwm> e;

    owv(wzi<gwt> wzi, wzi<owo> wzi2, wzi<uqm> wzi3, wzi<Context> wzi4, wzi<gwm> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ ows a() {
        owu owu = new owu((gwt) a(this.a.get(), 1), (owo) a(this.b.get(), 2), (uqm) a(this.c.get(), 3), (Context) a(this.d.get(), 4), (gwm) a(this.e.get(), 5));
        return owu;
    }
}
