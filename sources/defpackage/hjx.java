package defpackage;

import android.content.Context;

/* renamed from: hjx reason: default package */
public final class hjx implements wig<hjw> {
    private final wzi<Context> a;
    private final wzi<Boolean> b;

    private hjx(wzi<Context> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hjx a(wzi<Context> wzi, wzi<Boolean> wzi2) {
        return new hjx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new hjw((Context) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}
