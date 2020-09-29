package defpackage;

import android.content.Context;

/* renamed from: wcg reason: default package */
public final class wcg implements wig<jvq> {
    private final wzi<Context> a;

    private wcg(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static jvq a(Context context) {
        return (jvq) wil.a(jvr.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static wcg a(wzi<Context> wzi) {
        return new wcg(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
