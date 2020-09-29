package defpackage;

import android.content.Context;

/* renamed from: ufq reason: default package */
public final class ufq implements wig<ufp> {
    private final wzi<Context> a;

    private ufq(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ufq a(wzi<Context> wzi) {
        return new ufq(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ufp((Context) this.a.get());
    }
}
