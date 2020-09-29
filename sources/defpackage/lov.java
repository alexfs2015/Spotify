package defpackage;

import android.content.Context;

/* renamed from: lov reason: default package */
public final class lov implements wig<lou> {
    private final wzi<Context> a;

    private lov(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static lou a(Context context) {
        return new lou(context);
    }

    public static lov a(wzi<Context> wzi) {
        return new lov(wzi);
    }

    public final /* synthetic */ Object get() {
        return new lou((Context) this.a.get());
    }
}
